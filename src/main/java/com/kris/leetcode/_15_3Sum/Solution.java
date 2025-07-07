package com.kris.leetcode._15_3Sum;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 3 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */
public class Solution {

    Set<List<Integer>> uniqueTriplets  = new HashSet<>();

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int pointerOne = 0;
        int pointerTwo = 1;
        int pointerThree = 2;

        while (pointerOne <= nums.length - 3) {

            int num1 = nums[pointerOne];
            int num2 = nums[pointerTwo];
            int num3 = nums[pointerThree];

            if (num1 + num2 + num3 == 0) {
                addTriplet(num1, num2, num3, result);
            }

            // Упрощенная логика перемещения указателей
            if (pointerThree < nums.length - 1) {
                pointerThree++;
            } else if (pointerTwo < nums.length - 2) {
                pointerTwo++;
                pointerThree = pointerTwo + 1;
            } else {
                pointerOne++;
                pointerTwo = pointerOne + 1;
                pointerThree = pointerTwo + 1;
            }

        }
        return result;
    }

    private void addTriplet(int num1, int num2, int num3, List<List<Integer>> result) {
        List<Integer> triplet = Arrays.asList(
                num1,
                num2,
                num3);

        List<Integer> sortedTriplet = triplet.stream()
                .sorted()
                .collect(Collectors.toList());

        if (uniqueTriplets.add(sortedTriplet)) {
            result.add(sortedTriplet);
        }
    }

}

