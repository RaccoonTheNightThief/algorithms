package com.kris.leetcode._7_Reverse_Integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void reverse1() {
        var actual = solution.reverse(123);
        assertEquals(321, actual);
    }

    @Test
    void reverse2() {
        var actual = solution.reverse(-123);
        assertEquals(-321, actual);
    }

    @Test
    void reverse3() {
        var actual = solution.reverse(123);
        assertEquals(321, actual);
    }

    @Test
    void reverse4() {
        var actual = solution.reverse(0);
        assertEquals(0, actual);
    }
}