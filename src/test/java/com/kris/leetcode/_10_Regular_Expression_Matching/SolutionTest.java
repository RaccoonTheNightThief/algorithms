package com.kris.leetcode._10_Regular_Expression_Matching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void isMatch11() {
        var actual = solution.isMatch1("aa", "a");
        assertFalse(actual);
    }

    @Test
    void isMatch12() {
        var actual = solution.isMatch1("aa", "a*");
        assertTrue(actual);
    }

    @Test
    void isMatch13() {
        var actual = solution.isMatch1("ab", ".*");
        assertTrue(actual);
    }


}