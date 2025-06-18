package com.kris.leetcode._4_Median_of_two_sorted_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void badFindMedianSortedArrays1() {
        var expected = 2.5;
        var actual = solution.badFindMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

        assertEquals(expected, actual);
    }

    @Test
    void badFindMedianSortedArrays2() {
        var expected = 2;
        var actual = solution.badFindMedianSortedArrays(new int[]{1, 3}, new int[]{2});

        assertEquals(expected, actual);
    }

    @Test
    void badFindMedianSortedArrays3() {
        var expected = 3.5;
        var actual = solution.badFindMedianSortedArrays(new int[]{1, 3, 8}, new int[]{2, 4, 6});

        assertEquals(expected, actual);
    }


    @Test
    void findMedianSortedArrays1() {
        var expected = 2;
        var actual = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});

        assertEquals(expected, actual);
    }

    @Test
    void findMedianSortedArrays2() {
        var expected = 2.5;
        var actual = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

        assertEquals(expected, actual);
    }

    @Test
    void findMedianSortedArrays3() {
        var expected = 3.5;
        var actual = solution.findMedianSortedArrays(new int[]{1, 3, 8}, new int[]{2, 4, 6});

        assertEquals(expected, actual);
    }
}