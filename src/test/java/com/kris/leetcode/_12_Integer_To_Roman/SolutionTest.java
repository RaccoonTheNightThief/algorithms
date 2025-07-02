package com.kris.leetcode._12_Integer_To_Roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void intToRoman1() {
        var actual = solution.intToRoman(3749);
        assertEquals("MMMDCCXLIX", actual);
    }

    @Test
    void intToRoman2() {
        var actual = solution.intToRoman(58);
        assertEquals("LVIII", actual);
    }

    @Test
    void intToRoman3() {
        var actual = solution.intToRoman(1994);
        assertEquals("MCMXCIV", actual);
    }

}