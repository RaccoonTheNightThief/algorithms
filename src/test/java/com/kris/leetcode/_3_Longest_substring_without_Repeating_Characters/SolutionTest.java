package com.kris.leetcode._3_Longest_substring_without_Repeating_Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring1() {
        Solution solution = new Solution();
        var expected = 3;

        var actual = solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring2() {
        Solution solution = new Solution();
        var expected = 2;

        var actual = solution.lengthOfLongestSubstring("aab");
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring3() {
        Solution solution = new Solution();
        var expected = 3;

        var actual = solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring4() {
        Solution solution = new Solution();
        var expected = 1;

        var actual = solution.lengthOfLongestSubstring("bbbbb");
        assertEquals(expected, actual);
    }


    @Test
    void anotherLengthOfLongestSubstring1() {
        Solution solution = new Solution();
        var expected = 3;

        var actual = solution.anotherLengthOfLongestSubstring("pwwkew");
        assertEquals(expected, actual);
    }

    @Test
    void anotherLengthOfLongestSubstring2() {
        Solution solution = new Solution();
        var expected = 2;

        var actual = solution.anotherLengthOfLongestSubstring("aab");
        assertEquals(expected, actual);
    }

    @Test
    void anotherLengthOfLongestSubstring3() {
        Solution solution = new Solution();
        var expected = 3;

        var actual = solution.anotherLengthOfLongestSubstring("abcabcbb");
        assertEquals(expected, actual);
    }

    @Test
    void anotherLengthOfLongestSubstring4() {
        Solution solution = new Solution();
        var expected = 1;

        var actual = solution.anotherLengthOfLongestSubstring("bbbbb");
        assertEquals(expected, actual);
    }
}