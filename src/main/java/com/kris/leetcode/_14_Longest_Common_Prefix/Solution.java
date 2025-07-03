package com.kris.leetcode._14_Longest_Common_Prefix;

import java.util.Objects;

/**
 * 14. Longest Common Prefix
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * <p>
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 */
public class Solution {


    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int length = strs.length;
        int indexCharacter = 0;
        String temp;
        int i = 0;
        while (i < length) {

            try {
                temp = strs[i].substring(0, indexCharacter + 1);

            } catch (IndexOutOfBoundsException e) {
                if (result.isEmpty() || i == 0) return result;
                else return result.substring(0, result.length() - 1);
            }

            if (i == 0) {
                result = temp;
                i++;
                continue;
            }

            if (result.equals(temp)) {
                if (i == length - 1) {
                    i = 0;
                    indexCharacter++;
                    continue;
                }
                result = temp;
            } else {
                if (i != 0) {
                    return result.substring(0, result.length() - 1);
                }
            }
            i++;
        }
        return result;
    }


    public String longestCommonPrefix1(String[] strs) {
        if (Objects.isNull(strs) || strs.length == 0) return "";

        String commonPart = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String temp = strs[i];
            while (commonPart.length() > temp.length() || !commonPart.equals(temp.substring(0, commonPart.length()))) {
                commonPart = commonPart.substring(0, commonPart.length() - 1);
            }
        }
        return commonPart;
    }
}

/*
      if (strs == null || strs.length == 0) return "";

        String pref = strs[0];
        int prefLen = pref.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
                prefLen--;
                if (prefLen == 0) {
                    return "";
                }
                pref = pref.substring(0, prefLen);
            }
        }

        return pref;
 */