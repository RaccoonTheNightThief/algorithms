package com.kris.leetcode._8_String_to_integer_atoi;

import java.math.BigInteger;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * Whitespace: Ignore any leading whitespace (" ").
 * Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
 * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
 * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
 * Return the integer as the final result.
 * <p>
 * <p>
 * Example 1:
 * Input: s = "42"
 * Output: 42
 * <p>
 * Explanation:
 * The underlined characters are what is read in and the caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "42" ("42" is read in)
 * ^
 * <p>
 * <p>
 * Example 2:
 * Input: s = " -042"
 * Output: -42
 * <p>
 * Explanation:
 * Step 1: "   -042" (leading whitespace is read and ignored)
 * ^
 * Step 2: "   -042" ('-' is read, so the result should be negative)
 * ^
 * Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
 * ^
 * <p>
 * <p>
 * Example 3:
 * Input: s = "1337c0d3"
 * Output: 1337
 * <p>
 * Explanation:
 * Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
 * ^
 * <p>
 * Example 4:
 * Input: s = "0-1"
 * Output: 0
 * <p>
 * Explanation:
 * Step 1: "0-1" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
 * ^
 * <p>
 * Example 5:
 * Input: s = "words and 987"
 * Output: 0
 * <p>
 * Explanation:
 * Reading stops at the first non-digit character 'w'.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 200
 * s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 */
public class Solution {
    public int myAtoi(String s) {
        s = s.strip();
        if (s.isEmpty()) return 0;
        boolean negative = false;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder realInt = new StringBuilder();
        char c1 = sb.charAt(0);
        if (c1 == '-' || c1 == '+') {
            if (c1 == '-') negative = true;
            sb.deleteCharAt(0);
        }

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (c < '0' || c > '9') {
                break;
            }
            if (c == '0' && realInt.isEmpty()) {
                continue;
            }
            realInt.append(c);
        }
        if (realInt.isEmpty()) return 0;

        BigInteger result = new BigInteger(realInt.toString());

        if (negative) {
            result = result.negate();
        }
        try {
            return result.intValueExact();
        } catch (ArithmeticException e) {
            if (negative){
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }
    }

    public int myAtoiBest(String s) {
        s = s.trim(); // Remove leading whitespace
        int sign = 1, i = 0;
        long res = 0; // Using long to handle overflow cases

        if (s.isEmpty()) return 0;

        // Check for sign
        if (s.charAt(0) == '-') { sign = -1; i++; }
        else if (s.charAt(0) == '+') { i++; }

        // Process numerical characters
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break; // Stop at non-numeric character

            res = res * 10 + (ch - '0'); // Convert char to number
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * res);
    }
}
