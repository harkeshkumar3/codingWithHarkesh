package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));  // Output: 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));     // Output: 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));    // Output: 3
    }
}


class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        Set<Character> seen = new HashSet<>();
        int maxLength = 0;

        while (right < s.length()) {
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                System.out.println(s.charAt(left));
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}