package com.kris.leetcode._7_Reverse_Integer;

/*

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321


Example 2:

Input: x = -123
Output: -321


Example 3:

Input: x = 120
Output: 21


Constraints:

-231 <= x <= 231 - 1

 */
public class Solution {
    public int reverse(int x) {
        if (x == 0) return 0;
        StringBuilder src = new StringBuilder();
        src.append(x);
        if (src.isEmpty()) return 0;
        if (src.charAt(0) == '-') {
            src.deleteCharAt(0);
            src.append('-');
        }
        while (!src.isEmpty() && src.charAt(src.length() - 1) == '0') {
            src.deleteCharAt(src.length() - 1);
        }
        long result = Long.parseLong(src.reverse().toString());
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
            return 0;
        return (int) result;
    }
}
