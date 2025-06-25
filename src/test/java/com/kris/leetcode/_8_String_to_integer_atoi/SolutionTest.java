package com.kris.leetcode._8_String_to_integer_atoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void myAtoi1() {
        int actual = solution.myAtoi("42");
        assertEquals(42, actual);
    }

    @Test
    void myAtoi2() {
        int actual = solution.myAtoi("     -042");
        assertEquals(-42, actual);
    }

    @Test
    void myAtoi3() {
        int actual = solution.myAtoi("1337c0d3");
        assertEquals(1337, actual);
    }

    @Test
    void myAtoi4() {
        int actual = solution.myAtoi("0-1");
        assertEquals(0, actual);
    }

    @Test
    void myAtoi5() {
        int actual = solution.myAtoi("words and 987");
        assertEquals(0, actual);
    }

    @Test
    void myAtoi6() {
        int actual = solution.myAtoi("-91283472332");
        assertEquals(-2147483648, actual);
    }

    @Test
    void myAtoi7() {
        int actual = solution.myAtoi("+1");
        assertEquals(1, actual);
    }

    @Test
    void myAtoi8() {
        int actual = solution.myAtoi("");
        assertEquals(0, actual);
    }

    @Test
    void myAtoi9() {
        int actual = solution.myAtoi("-+12");
        assertEquals(0, actual);
    }

    @Test
    void myAtoi10() {
        int actual = solution.myAtoi(" ");
        assertEquals(0, actual);
    }

    @Test
    void myAtoi11() {
        int actual = solution.myAtoi("20000000000000000000");
        assertEquals(0x7fffffff, actual);
    }
}