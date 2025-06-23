package com.kris.leetcode._6_Zigzag_Conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void convertMy1() {
        var actual = solution.convertMy("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR",actual);
    }

    @Test
    void convertMy2() {
        var actual = solution.convertMy("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI",actual);
    }

    @Test
    void convertMy3() {
        var actual = solution.convertMy("A", 1);
        assertEquals("A",actual);
    }

    @Test
    void convertMy4() {
        var actual = solution.convertMy("A", 2);
        assertEquals("A",actual);
    }
}