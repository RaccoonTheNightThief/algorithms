package com.kris.leetcode._1_two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void twoSum1() {
        int[] expected = {0,1};
        int[] actual = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum2() {
        int[] expected = {1,2};
        int[] actual = solution.twoSum(new int[]{3,2,4}, 6);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum3() {
        int[] expected = {0,1};
        int[] actual = solution.twoSum(new int[]{3,3}, 6);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum4() {
        int[] expected = {0,2};
        int[] actual = solution.twoSum(new int[]{3,2,3}, 6);
        assertArrayEquals(expected, actual);
    }

}