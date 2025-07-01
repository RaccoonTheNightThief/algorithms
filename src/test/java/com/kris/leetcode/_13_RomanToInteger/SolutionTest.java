package com.kris.leetcode._13_RomanToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void romanToInt1() {
        var actual = solution.romanToInt("III");
        assertEquals(3, actual);
    }

    @Test
    void romanToInt2() {
        var actual = solution.romanToInt("LVIII");
        assertEquals(58, actual);
    }

    @Test
    void romanToInt3() {
        var actual = solution.romanToInt("MCMXCIV");
        assertEquals(1994, actual);
    }
}