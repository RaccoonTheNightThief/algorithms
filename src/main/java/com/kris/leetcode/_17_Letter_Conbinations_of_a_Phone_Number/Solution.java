package com.kris.leetcode._17_Letter_Conbinations_of_a_Phone_Number;

import java.util.*;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * <p>
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: digits = ""
 * Output: []
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: digits = "2"
 * Output: ["a","b","c"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ["2", "9"].
 */
public class Solution {
    Map<Character, List<String>> map = Map.ofEntries(
            Map.entry('1', List.of()),
            Map.entry('2', List.of("a", "b", "c")),
            Map.entry('3', List.of("d", "e", "f")),
            Map.entry('4', List.of("g", "h", "i")),
            Map.entry('5', List.of("j", "k", "l")),
            Map.entry('6', List.of("m", "n", "o")),
            Map.entry('7', List.of("p", "q", "r", "s")),
            Map.entry('8', List.of("t", "u", "v")),
            Map.entry('9', List.of("w", "x", "y", "z"))
    );

    //231
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return List.of();
        }

        if (digits.length() == 1) {
            return new ArrayList<>(map.get(digits.charAt(0)));
        }
        Character mainNum = digits.charAt(0);
        List<String> mainSet = map.get(mainNum);

        for (int i = 0; i < digits.length() - 1; i++) {

            int j = i + 1;

            Character childNum = digits.charAt(j);
            List<String> childSet = map.get(childNum);

            mainSet = multiply(mainSet, childSet);

        }

        return mainSet;

    }

    private List<String> multiply(List<String> mainSet, List<String> childSet) {
        List<String> res = new ArrayList<>();
        for (String string : mainSet) {
            for (String s : childSet) {
                res.add(string + s);
            }
        }

        return res;
    }
}
