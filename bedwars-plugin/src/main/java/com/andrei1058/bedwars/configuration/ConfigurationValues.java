package com.andrei1058.bedwars.configuration;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/** Detached values shared by reload, command validation and arena snapshots. */
public final class ConfigurationValues {
    private ConfigurationValues() {
    }

    public static Map<String, Object> leaves(ConfigurationSection configuration) {
        Map<String, Object> values = new TreeMap<>();
        for (String path : configuration.getKeys(true)) {
            Object value = configuration.get(path);
            if (!(value instanceof ConfigurationSection)) values.put(path, detach(value));
        }
        return values;
    }

    private static Object detach(Object value) {
        // SnakeYAML reloads float defaults as doubles; equal persisted values are not changes.
        if (value instanceof Float) return Double.parseDouble(value.toString());
        // Existing language defaults contain String[]; YAML persists them as lists.
        if (value instanceof Object[]) {
            Object[] array = (Object[]) value;
            List<Object> copy = new ArrayList<>(array.length);
            for (Object element : array) copy.add(detach(element));
            return copy;
        }
        if (value instanceof List<?>) {
            List<Object> copy = new ArrayList<>();
            for (Object element : (List<?>) value) copy.add(detach(element));
            return copy;
        }
        if (value instanceof Map<?, ?>) {
            Map<Object, Object> copy = new java.util.LinkedHashMap<>();
            ((Map<?, ?>) value).forEach((key, element) -> copy.put(detach(key), detach(element)));
            return copy;
        }
        return value;
    }

    public static YamlConfiguration copy(ConfigurationSection source) {
        YamlConfiguration copy = new YamlConfiguration();
        leaves(source).forEach(copy::set);
        return copy;
    }

    public static YamlConfiguration copy(ConfigurationSection source, Iterable<String> paths) {
        YamlConfiguration copy = new YamlConfiguration();
        for (String path : paths) copy.set(path, detach(source.get(path)));
        return copy;
    }

    public static Object parseValue(String input) throws InvalidConfigurationException {
        YamlConfiguration parsed = new YamlConfiguration();
        parsed.loadFromString("value: " + input);
        if (parsed.getKeys(false).size() != 1 || !parsed.contains("value")) {
            throw new IllegalArgumentException("invalid-value");
        }
        Object value = parsed.get("value");
        if (value instanceof List<?>) {
            for (Object element : (List<?>) value) requireScalar(element);
        } else {
            requireScalar(value);
        }
        return value;
    }

    private static void requireScalar(Object value) {
        if (!(value instanceof String || value instanceof Boolean || value instanceof Number)
                || value instanceof Number && !Double.isFinite(((Number) value).doubleValue())) {
            throw new IllegalArgumentException("invalid-value");
        }
    }

    /** Preserve consumer types; do not turn a quoted number into a numeric key. */
    public static Object convert(Object value, Object reference, Object defaultValue) {
        if (reference instanceof List<?>) {
            if (!(value instanceof List<?>)) throw new IllegalArgumentException("invalid-type");
            List<?> expected = (List<?>) reference;
            if (expected.isEmpty() && defaultValue instanceof List<?>) expected = (List<?>) defaultValue;
            List<Object> result = new ArrayList<>();
            Object sample = expected.isEmpty() ? null : expected.get(0);
            for (Object element : (List<?>) value) {
                requireScalar(element);
                if (sample == null) sample = element;
                result.add(convert(element, sample, null));
            }
            return result;
        }
        requireScalar(value);
        if (reference instanceof Number) {
            if (!(value instanceof Number)) throw new IllegalArgumentException("invalid-type");
            Number number = (Number) value;
            if (reference instanceof Integer || reference instanceof Long || reference instanceof Short || reference instanceof Byte) {
                if (!(value instanceof Integer || value instanceof Long || value instanceof Short || value instanceof Byte)) {
                    throw new IllegalArgumentException("invalid-type");
                }
                long integer = number.longValue();
                if (reference instanceof Integer) {
                    if (integer < Integer.MIN_VALUE || integer > Integer.MAX_VALUE) throw new IllegalArgumentException("invalid-type");
                    return (int) integer;
                }
                if (reference instanceof Short) {
                    if (integer < Short.MIN_VALUE || integer > Short.MAX_VALUE) throw new IllegalArgumentException("invalid-type");
                    return (short) integer;
                }
                if (reference instanceof Byte) {
                    if (integer < Byte.MIN_VALUE || integer > Byte.MAX_VALUE) throw new IllegalArgumentException("invalid-type");
                    return (byte) integer;
                }
                return integer;
            }
            return number.doubleValue();
        }
        if (reference instanceof String && value instanceof String || reference instanceof Boolean && value instanceof Boolean) {
            return value;
        }
        throw new IllegalArgumentException("invalid-type");
    }

    /** A single-line, color-safe YAML-style value, including full lists. */
    public static String display(Object value) {
        if (value == null) return "<缺失>";
        if (value instanceof List<?>) {
            List<String> elements = new ArrayList<>();
            for (Object element : (List<?>) value) elements.add(display(element));
            return "[" + String.join(", ", elements) + "]";
        }
        if (value instanceof Map<?, ?>) {
            List<String> elements = new ArrayList<>();
            ((Map<?, ?>) value).forEach((key, element) -> elements.add(display(key) + ": " + display(element)));
            return "{" + String.join(", ", elements) + "}";
        }
        String text = String.valueOf(value).replace("\\", "\\\\").replace("\"", "\\\"")
                .replace("\r", "\\r").replace("\n", "\\n").replace("\t", "\\t")
                .replace("§", "\\u00a7").replace("&", "\\u0026");
        return value instanceof String ? "\"" + text + "\"" : text;
    }
}
