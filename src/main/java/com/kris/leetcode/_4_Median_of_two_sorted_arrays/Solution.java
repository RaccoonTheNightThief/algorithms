package com.kris.leetcode._4_Median_of_two_sorted_arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 *
 *
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 *
 *  * Constraints:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */
public class Solution {
//    O((N+M)Log(N+M))
    public double badFindMedianSortedArrays(int[] nums1, int[] nums2) {
        var sortedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                .sorted()
                .toArray();
        if (sortedArray.length % 2 == 0) {
            int indexPred = sortedArray.length / 2 - 1;
            int indexNext = sortedArray.length / 2;
            return ( sortedArray[indexPred] + sortedArray[indexNext] ) / 2.0;
        }else {
            double index = (double)sortedArray.length / 2.0 - 0.5;
            return sortedArray[(int)index];
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Проверяем, какой массив короче, чтобы работать с ним как с первым
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;

        while (low <= high) {
            //  количество элементов из первого массива (nums1), попавших в левую часть
            int partitionX = (low + high) / 2;

            /*
            Количество элементов из второго массива (nums2), которые должны быть в левой части.
            Разбиваем второй массив так, чтобы общее количество элементов слева было (m+n+1)/2.
              Добавление +1 делает формулу универсальной для четного и нечетного количества элементов:
                Для четного (m+n): (m+n+1)/2 равно (m+n)/2 (так как целочисленное деление)
                Для нечетного (m+n): (m+n+1)/2 дает нам ровно середину
             */
            int elementovVseredineVObshemmassive = (m + n + 1) / 2;
            int partitionY = elementovVseredineVObshemmassive - partitionX;

            // Находим максимальные элементы в левых частях и минимальные в правы
            // последний элемент левой части nums1
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            // первый элемент правой части nums1
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            // последний элемент левой части nums2
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            // первый элемент правой части nums2
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            // Если нашли правильное разбиение
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // Если общее количество элементов четное
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    // Если нечетное
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                // Слишком много элементов из nums1 в левой части - двигаемся влево
                high = partitionX - 1;
            } else {
                // Слишком мало элементов из nums1 в левой части - двигаемся вправо
                low = partitionX + 1;
            }
        }

        // Сюда дойдем только если входные массивы не отсортированы
        throw new IllegalArgumentException("Input arrays are not sorted");
    }
//    {1 3 8}    2 4 6
//    {1} 2 4    {3 8} 6
//    {1 3} 2    {8} 4 6
}
