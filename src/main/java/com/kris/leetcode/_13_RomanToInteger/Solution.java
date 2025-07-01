package com.kris.leetcode._13_RomanToInteger;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * <p>
 * Example 1:
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * <p>
 * <p>
 * Example 2:
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * <p>
 * <p>
 * Example 3:
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class Solution {

    static Map<String, Integer> map = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("M", 1000),
            new AbstractMap.SimpleEntry<>("CM", 900),
            new AbstractMap.SimpleEntry<>("D", 500),
            new AbstractMap.SimpleEntry<>("CD", 400),
            new AbstractMap.SimpleEntry<>("C", 100),
            new AbstractMap.SimpleEntry<>("XC", 90),
            new AbstractMap.SimpleEntry<>("L", 50),
            new AbstractMap.SimpleEntry<>("XL", 40),
            new AbstractMap.SimpleEntry<>("X", 10),
            new AbstractMap.SimpleEntry<>("IX", 9),
            new AbstractMap.SimpleEntry<>("V", 5),
            new AbstractMap.SimpleEntry<>("IV", 4),
            new AbstractMap.SimpleEntry<>("I", 1)
    );

    public int romanToInt(String s) {

        int i = 0;
        int result = 0;
        int num = 0;

        while (i < s.length()) {
            if (i < s.length() - 1) {
                String twoSymbols = s.substring(i, i + 2);
                if (map.containsKey(twoSymbols)) {
                    num = map.get(twoSymbols);
                    i = i + 2;
                }
                else {
                    num = map.get(s.substring(i, i + 1));
                    i = i + 1;
                }
            }else {
                num = map.get(s.substring(i, i + 1));
                i = i + 1;
            }

            result = result + num;

        }
        return result;

    }

    public int romanToInt2(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));
    }

}
