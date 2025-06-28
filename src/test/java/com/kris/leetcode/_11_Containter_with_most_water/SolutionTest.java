package com.kris.leetcode._11_Containter_with_most_water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void maxArea1() {
        var actual = solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        assertEquals(49, actual);
    }

    @Test
    void maxArea2() {
        var actual = solution.maxArea(new int[]{1,1});
        assertEquals(1, actual);
    }

}