package com.kris.leetcode._9_Palindrome_Number;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 *
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 *
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 * -231 <= x <= 231 - 1
 *
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */

//4231 = 2 * 100 + 10 * 3 + 1 * 1
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverce = 0;
        int xCopy = x;
        while (xCopy > 0) {
            int temp = xCopy / 10;
            int ost = xCopy - temp * 10;
            reverce = reverce * 10 + ost;
            xCopy = temp;
        }

        return reverce == x;
    }
}
