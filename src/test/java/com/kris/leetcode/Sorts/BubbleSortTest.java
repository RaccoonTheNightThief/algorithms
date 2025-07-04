package com.kris.leetcode.Sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort bs = new BubbleSort();

    @Test
    void bubbleSort() {
        var actual = bs.bubbleSort(new int[]{4,11,5,6,1});
        assertArrayEquals(new int[]{1,4,5,6,11}, actual);
    }

}