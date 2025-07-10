package com.kris.leetcode._16_3Sum_Closest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void threeSumClosest1() {
        var actual = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        assertEquals(2, actual);
    }

    @Test
    void threeSumClosest2() {
        var actual = solution.threeSumClosest(new int[]{0, 0, 0}, 1);
        assertEquals(0, actual);
    }

    @Test
    void threeSumClosest3() {
        var actual = solution.threeSumClosest(new int[]{10,20,30,40,50,60,70,80,90}, 1);
        assertEquals(60, actual);
    }


}