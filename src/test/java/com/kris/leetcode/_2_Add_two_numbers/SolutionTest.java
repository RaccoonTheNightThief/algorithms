package com.kris.leetcode._2_Add_two_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void addTwoNumbers1() {

        var src1 = new Solution.ListNode(2, new Solution.ListNode(4, new Solution.ListNode(3)));
        var src2 = new Solution.ListNode(5, new Solution.ListNode(6, new Solution.ListNode(4)));
        var expected = new Solution.ListNode(7, new Solution.ListNode(0, new Solution.ListNode(8)));

        var actual = solution.addTwoNumbers(src1, src2);

        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbers2() {
//        l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        expected = [8,9,9,9,0,0,0,1]
        var src1 = new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9,
                new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9)))))));
        var src2 = new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9))));
        var expected = new Solution.ListNode(8, new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9,
                new Solution.ListNode(0, new Solution.ListNode(0, new Solution.ListNode(0, new Solution.ListNode(1))))))));

        var actual = solution.addTwoNumbers(src1, src2);

        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbers3() {

        var src1 = new Solution.ListNode(0);
        var src2 = new Solution.ListNode(0);
        var expected = new Solution.ListNode(0);

        var actual = solution.addTwoNumbers(src1, src2);

        assertEquals(expected, actual);
    }
    @Test
    void addTwoNumbersAnother1() {

        var src1 = new Solution.ListNode(2, new Solution.ListNode(4, new Solution.ListNode(3)));
        var src2 = new Solution.ListNode(5, new Solution.ListNode(6, new Solution.ListNode(4)));
        var expected = new Solution.ListNode(7, new Solution.ListNode(0, new Solution.ListNode(8)));

        var actual = solution.addTwoNumbersAnother(src1, src2);

        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbersAnother2() {
//        l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        expected = [8,9,9,9,0,0,0,1]
        var src1 = new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9,
                new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9)))))));
        var src2 = new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9))));
        var expected = new Solution.ListNode(8, new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9,
                new Solution.ListNode(0, new Solution.ListNode(0, new Solution.ListNode(0, new Solution.ListNode(1))))))));

        var actual = solution.addTwoNumbersAnother(src1, src2);

        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbersAnother3() {

        var src1 = new Solution.ListNode(0);
        var src2 = new Solution.ListNode(0);
        var expected = new Solution.ListNode(0);

        var actual = solution.addTwoNumbersAnother(src1, src2);

        assertEquals(expected, actual);
    }
}