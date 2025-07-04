package com.kris.leetcode.Sorts;

public class BubbleSort {


    public int[] bubbleSort(int[] arr) {
//        var actual = bs.bubbleSort(new int[]{4,11,5,6,1});
//        assertArrayEquals(new int[]{1,4,5,6,11}, actual);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
