package com.kris.leetcode._6_Zigzag_Conversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * 0123456789
 * Input: s = "PAYPAL ISHI RI NG", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N   3
 * A   L S  I G   2
 * Y A   H R      1
 * P     I        0
 * <p>
 * // l = 14;
 * // 14 / 4 = 3.5
 * //
 * Example 3:
 * <p>
 * Input: s = "A", numRows = 1
 * Output: "A"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */
public class Solution {

    public String convertMy(String s, int numRows) {
        if (numRows > s.length()) return s;
        StringBuilder result = new StringBuilder();
        int numLettersBeetweenZigzag = Math.max(numRows - 2, 0);
        int delimeter = numRows + numLettersBeetweenZigzag;
        int index = 0;
        Map<Integer, ArrayList<Character>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //num = 4
            //4->2
            //5->1

            if (i % delimeter >= numRows){
                int shiftDown = i % (numRows - 1);      //3 % (3-1) = 3 % 2 = 1
                index = numRows - 1 - shiftDown;        //index = (3 - 1) - 1 = 2
            }else {
                index = i % delimeter;
            }

            if (!map.containsKey(index)) {
                ArrayList<Character> value = new ArrayList<>();
                value.add(s.charAt(i));
                map.put(index, value);
            } else {
                ArrayList<Character> value = map.get(index);
                value.add(s.charAt(i));
            }

        }

        for (int i = 0; i < numRows; i++) {
            ArrayList<Character> characters = map.get(i);
            for (Character value : characters) {
                result.append(value);
            }

        }
        return result.toString();
    }

    public String convertBest(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int idx = 0, d = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
