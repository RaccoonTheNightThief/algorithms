package com.kris.leetcode._14_Longest_Common_Prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void longestCommonPrefix1() {
        var actual = solution.longestCommonPrefix1(new String[]{"flower","flow","flight"});
        assertEquals("fl", actual);
    }

    @Test
    void longestCommonPrefix2() {
        var actual = solution.longestCommonPrefix(new String[]{"dog","racecar","car"});
        assertEquals("", actual);
    }

    @Test
    void longestCommonPrefix3() {
        var actual = solution.longestCommonPrefix(new String[]{""});
        assertEquals("", actual);
    }
    @Test
    void longestCommonPrefix4() {
        var actual = solution.longestCommonPrefix(new String[]{"flower","flower","flower","flower"});
        assertEquals("flower", actual);
    }
}