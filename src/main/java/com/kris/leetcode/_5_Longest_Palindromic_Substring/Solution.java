package com.kris.leetcode._5_Longest_Palindromic_Substring;

/**
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class Solution {
//    public String longestPalindrome(String s) {
//        StringBuilder src = new StringBuilder(s); //                 babad  => babad
//        StringBuilder srcReverce = new StringBuilder(s).reverse(); //babad  => dabab fa
//        int shiftI = 0;
//        int shiftJ = 0;
//        StringBuilder tempResult = new StringBuilder();
//        String result = "";
//        for (int i = 0; i < s.length(); i++) {
//
//            Character character = src.charAt(shiftI);
//            Character characterRev = srcReverce.charAt(shiftJ);
//
//            while (character != srcReverce.charAt(shiftJ)){
//                shiftJ++;
//            }
//
//            if (shiftJ + shiftI == s.length()){
//                if (tempResult.isEmpty()) {
//                    return "";
//                } else {
//                    tempResult.insert(tempResult.length() / 2, character);
//                    if (result.length() < tempResult.length()) result = String.valueOf(tempResult);
//                    tempResult = new StringBuilder();
//                    shiftI = i;
//                    shiftJ = 0;
//                    continue;
//                }
//            }
//
//            characterRev = srcReverce.charAt(j);
//
//            tempResult.insert(tempResult.length() / 2, character);  // babad
//            tempResult.insert(tempResult.length() / 2 + 1, characterRev);

    /// /            shiftJ = 0;
//
//        }
//        return String.valueOf(1);
//    }
    public String longestPalindrome1(String s) {
        if (s.length() == 1) return s;

        int maxLength = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            // Проверяем палиндромы нечетной длины (центр - i)
            int lengthExpand1 = expandFromCenter(s, i, i);
            // Проверяем палиндромы четной длины (центр между i и i+1)
            int lengthExpand2 = expandFromCenter(s, i, i + 1);
            int lengthExpand = Math.max(lengthExpand1, lengthExpand2);

            if (lengthExpand > maxLength) {
                maxLength = lengthExpand;
                int start = i - (lengthExpand - 1) / 2;
                int end = i + lengthExpand / 2 + 1;
                result = s.substring(start, end);
            }

        }
        return result;
    }

//    01234
//    babad(l=3)
//    cbbd (l=2)
//    m = l/2
//    m = 3/2 = 1     i-m =1-1 =0      i+m = 2
//    m = 2/2 = 1     i-m =1-1 =0(1)   i+m = 2


    private int expandFromCenter(String s, int left, int right) {
        int maxLength = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            maxLength = Math.max(maxLength, right - left + 1);
            left--;
            right++;
        }
        return maxLength;
    }

}
