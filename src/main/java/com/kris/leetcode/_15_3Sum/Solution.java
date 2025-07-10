package com.kris.leetcode._15_3Sum;

import java.util.*;
import java.util.stream.Collectors;

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

    Set<List<Integer>> uniqueTriplets = new HashSet<>();

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

    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        addTriplet(nums[i], nums[j], nums[k], result);
                    }

                    if (nums[i] + nums[j] + nums[k] > 0 && nums[i] > 0) {
                        return result;
                    }
                }
            }
        }
        return result;
    }


    public List<List<Integer>> threeSumBest(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        //    -4, -1, -1, 0, 1, 2
//                 i   j        k

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i - 1] == nums[i]) continue;

            int j = i + 1;                      //2
            int k = nums.length - 1;            //5

            while (j < k) {//2<5
                int sum = nums[i] + nums[j] + nums[k]; //-1 + -1 + 2 = 0
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j - 1] == nums[j] && j < k) {
                        j++;
                    }
                }
            }

        }
        return result;
    }

}

