package com.kris.leetcode._2_Add_two_numbers;


/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ListNode other = (ListNode) obj;

            // Проверяем текущее значение узла и рекурсивно проверяем следующий узел
            return val == other.val && (next == null ? other.next == null : next.equals(other.next));
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;

            // Вычисляем хеш-код на основе значения и хеш-кода следующего узла
            result = prime * result + val;
            result = prime * result + (next == null ? 0 : next.hashCode());
            return result;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ListNode(");
            sb.append(val);
            ListNode current = next;
            while (current != null) {
                sb.append(" -> ");
                sb.append(current.val);
                current = current.next;
            }
            sb.append(")");
            return sb.toString();
        }

    }

//    по памяти лучше
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode revertResult = null;

        int predVUme = 0;
        while (l1 != null || l2 != null) {

            int tempVal1 = l1 != null ? l1.val : 0;
            int tempVal2 = l2 != null ? l2.val : 0;
            int sumTempVal = tempVal1 + tempVal2 + predVUme;
            predVUme = 0;
            if (result == null) {
                result = new ListNode(sumTempVal % 10);
            } else {
                result = new ListNode(sumTempVal % 10, result);
            }

            if (sumTempVal > 9) {
                predVUme = sumTempVal / 10;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

        }

        if (predVUme != 0) {
            result = new ListNode(predVUme, result);
        }

//     8 0 7
//        revertResult =8
//     temp 8 -> 0 8
//     temp 0 -> 7 0 8
//     null   -> 7 0 null
        if (result != null) revertResult = new ListNode(result.val);
        while (result != null) {

            if (result.next != null) {
                revertResult = new ListNode(result.next.val, revertResult);
            }

            result = result.next;

        }

        return revertResult;
    }

    public ListNode addTwoNumbersAnother(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int predVUme = 0;

        while (l1 != null || l2 != null || predVUme != 0) {

            int tempVal1 = l1 != null ? l1.val : 0;
            int tempVal2 = l2 != null ? l2.val : 0;
            int sumTempVal = tempVal1 + tempVal2 + predVUme;
            predVUme = sumTempVal / 10;

            curr.next = new ListNode(sumTempVal % 10);
            curr = curr.next;


            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

        }

        return dummyHead.next;
    }
}


