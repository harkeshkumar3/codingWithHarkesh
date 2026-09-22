package org.example.Coding;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 7, 8, 10, 3, 11, 12, 13, 14, 2};
        ConsecutiveSequence sequence = new ConsecutiveSequence();
        int longestConsecutive = sequence.longestConsecutive(nums);
        System.out.println(longestConsecutive);
    }

    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> seen = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for (int num : nums) {
            // Num is the start of a sequence
            if (seen.contains(num - 1))
                continue;
            int length = 1;
            while (seen.contains(++num))
                ++length;
            ans = Math.max(ans, length);
        }

        return ans;
    }
}


