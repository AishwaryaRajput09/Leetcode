/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = null;
        ListNode current = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;

            int currentSum = value1 + value2 + carry;
            carry = currentSum / 10;

            if (sum == null) {
                sum = new ListNode(currentSum % 10);
                current = sum;
            } else {
                current.next = new ListNode(currentSum % 10);
                current = current.next;
            }

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return sum;
    }
}
