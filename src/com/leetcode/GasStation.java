package org.example.leetcode;

import java.util.Arrays;

public class GasStation {

    public static void main(String[] args) {
        int[] gas = {7, 1, 0, 11, 4};
        int[] cost = {5, 9, 1, 2, 5};
        GasStation gasStation = new GasStation();

        System.out.println(gasStation.canCompleteCircuit(gas, cost));

    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        final int gasses = Arrays.stream(gas).sum();
        final int costs = Arrays.stream(cost).sum();
        if (gasses - costs < 0)
            return -1;

        int ans = 0;
        int sum = 0;

        // Try to start from each index
        for (int i = 0; i < gas.length; ++i) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                sum = 0;
                ans = i + 1; // Start from next index
            }
        }

        return ans;
    }
}

