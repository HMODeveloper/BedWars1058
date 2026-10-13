/*
 * BedWars1058 - A bed wars mini-game.
 * Copyright (C) 2021 Andrei Dascălu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Contact e-mail: andrew.dascalu@gmail.com
 */

package com.andrei1058.bedwars.api.arena.generator;

import org.bukkit.entity.Item;

/**
 * Stores generator identity and ground-merge policy on the item entity, not its item stack.
 * The hidden entity name survives chunk saves without changing inventory stacking.
 */
public final class GeneratorDrop {

    private static final String STACK_NAME = "bw1058-generator-drop:stack";
    private static final String NO_STACK_NAME = "bw1058-generator-drop:no-stack";

    private GeneratorDrop() {
    }

    /**
     * Mark a generator resource entity and select whether it may merge on the ground.
     */
    public static void mark(Item item, boolean stack) {
        item.setCustomName(stack ? STACK_NAME : NO_STACK_NAME);
        item.setCustomNameVisible(false);
    }

    public static boolean isGeneratorDrop(Item item) {
        String name = item.getCustomName();
        return STACK_NAME.equals(name) || NO_STACK_NAME.equals(name);
    }

    public static boolean preventsMerge(Item item) {
        return NO_STACK_NAME.equals(item.getCustomName());
    }
}
