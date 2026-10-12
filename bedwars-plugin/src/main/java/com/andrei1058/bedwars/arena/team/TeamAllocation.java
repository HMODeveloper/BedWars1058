package com.andrei1058.bedwars.arena.team;

/** Integer-only allocation planning; fixed members are never moved. */
final class TeamAllocation {
    private TeamAllocation() {}

    static int[] targetSizes(int[] fixedSizes, int remainingPlayers, int maxInTeam, boolean preferPairs) {
        if (fixedSizes == null || remainingPlayers < 0 || maxInTeam < 1) {
            throw new IllegalArgumentException("Invalid team allocation input");
        }
        long total = remainingPlayers;
        int occupied = 0;
        for (int size : fixedSizes) {
            if (size < 0 || size > maxInTeam) throw new IllegalArgumentException("Invalid fixed team size");
            total += size;
            if (size > 0) occupied++;
        }
        if (total > (long) fixedSizes.length * maxInTeam) throw new IllegalArgumentException("Insufficient team capacity");
        int[] best = new int[fixedSizes.length];
        if (total == 0) return best;
        int maximum = (int) Math.min(fixedSizes.length, Math.min((long) occupied + remainingPlayers, total));
        int minimum = Math.max(occupied, Math.min(2, maximum));
        int[] work = new int[fixedSizes.length];
        int bestSingles = Integer.MAX_VALUE;
        int bestCount = -1;
        for (int count = minimum; count <= maximum; count++) {
            if ((long) count * maxInTeam < total) continue;
            System.arraycopy(fixedSizes, 0, work, 0, work.length);
            int left = remainingPlayers;
            int activate = count - occupied;
            for (int i = 0; i < work.length && activate > 0; i++) {
                if (work[i] == 0) {
                    work[i] = 1;
                    activate--;
                    left--;
                }
            }
            while (left > 0) {
                int smallest = -1;
                for (int i = 0; i < work.length; i++) {
                    if (work[i] > 0 && work[i] < maxInTeam && (smallest < 0 || work[i] < work[smallest])) smallest = i;
                }
                if (smallest < 0) throw new IllegalStateException("No capacity in feasible allocation");
                work[smallest]++;
                left--;
            }
            int singles = 0;
            if (preferPairs && maxInTeam > 1) for (int size : work) if (size == 1) singles++;
            if (singles < bestSingles || singles == bestSingles && count > bestCount) {
                System.arraycopy(work, 0, best, 0, work.length);
                bestSingles = singles;
                bestCount = count;
            }
        }
        if (bestCount < 0) throw new IllegalStateException("No feasible team allocation");
        return best;
    }
}
