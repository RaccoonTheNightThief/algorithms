package com.kris.leetcode._3_Longest_substring_without_Repeating_Characters;

import java.util.*;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (!list.contains(character)) {
                list.add(character);
            } else {
                int indexToDelete = list.indexOf(character);
                if (indexToDelete >= 0) {
                    list.subList(0, indexToDelete + 1).clear();
                }
                list.add(character);
            }
            if (list.size() > maxLength) maxLength = list.size();
        }
        return maxLength;
    }

    public int anotherLengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left){
                left = lastSeen.get(c) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            lastSeen.put(c, right);
        }
        return maxLength;
    }

}
