package com.kris.leetcode.Sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    InsertionSort insertionSort = new InsertionSort();

    @Test
    void insertionSort() {
        var actual = insertionSort.insertionSort(new int[]{4,11,5,6,1});
        assertArrayEquals(new int[]{1,4,5,6,11}, actual);
    }
}