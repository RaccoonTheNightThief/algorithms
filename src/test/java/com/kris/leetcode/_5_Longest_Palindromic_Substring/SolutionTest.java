package com.kris.leetcode._5_Longest_Palindromic_Substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void longestPalindrome1() {
        String actual = solution.longestPalindrome1("babad");
//        String expected1 = "aba";
        String expected2 = "bab";
        assertEquals(expected2, actual);
    }

    @Test
    void longestPalindrome2() {
        String actual = solution.longestPalindrome1("cbbd");
        String expected = "bb";
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindrome3() {
        String actual = solution.longestPalindrome1("cbabdaaaaa");
        String expected = "aaaaa";
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindrome4() {
        String actual = solution.longestPalindrome1("a");
        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindrome5() {
        String actual = solution.longestPalindrome1("bb");
        String expected = "bb";
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindrome6() {
        String actual = solution.longestPalindrome1("aaaa");
        String expected = "aaaa";
        assertEquals(expected, actual);
    }
}