package com.kris.leetcode._9_Palindrome_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void isPalindrome1() {
        var actual = solution.isPalindrome(121);
        assertTrue(actual);
    }

    @Test
    void isPalindrome2() {
        var actual = solution.isPalindrome(-121);
        assertFalse(actual);
    }

    @Test
    void isPalindrome3() {
        var actual = solution.isPalindrome(10);
        assertFalse(actual);
    }

}