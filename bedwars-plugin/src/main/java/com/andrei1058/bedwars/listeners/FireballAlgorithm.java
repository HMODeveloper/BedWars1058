package com.andrei1058.bedwars.listeners;

import java.util.Locale;

public enum FireballAlgorithm {
    DEFAULT, ASTRA;

    public static FireballAlgorithm parse(String value) {
        if (value != null) {
            switch (value.toLowerCase(Locale.ROOT)) {
                case "default": return DEFAULT;
                case "astra": return ASTRA;
                default: break;
            }
        }
        throw new IllegalArgumentException("fireball.algorithm must be default or astra");
    }
}
