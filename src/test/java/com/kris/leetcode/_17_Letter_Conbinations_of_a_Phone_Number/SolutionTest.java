package com.kris.leetcode._17_Letter_Conbinations_of_a_Phone_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void letterCombinations1() {
        var actual = solution.letterCombinations("23");
        assertEquals(Set.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), new HashSet<String>(actual));

    }

    @Test
    void letterCombinations2() {
        var actual = solution.letterCombinations("");
        assertEquals(List.of(), actual);
    }

    @Test
    void letterCombinations3() {
        var actual = solution.letterCombinations("2");
        assertEquals(List.of("a", "b", "c"), actual);
    }

    @Test
    void letterCombinations4() {
        var actual = solution.letterCombinations("234");
        assertEquals(Set.of("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"), new HashSet<>(actual));
    }
}