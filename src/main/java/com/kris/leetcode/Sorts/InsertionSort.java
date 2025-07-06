package com.kris.leetcode.Sorts;

/**
 * Сортировка вставками.
 * O(n^2)
 */
public class InsertionSort {

    public int[] insertionSort(int[] arr) {
//      new int[]{4,11,5,6,1}
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }
}