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
    public ListNode rotateRight(ListNode head, int k) {
        int size=1;
        if (head == null || k == 0) return head; // edge cases
        ListNode node = head;
        while (node.next != null) { // make the list circular
            node = node.next;
            size++;
        }
        k = k%size;
        node.next = head;
        ListNode end = node.next; // end node of the list
        for (int i = 0; i <size-k-1; i++) { // move k steps backward from the end node
            end = end.next;
        }
        head = end.next; // new head of the list
        end.next = null; // break the loop
        return head; // return the new head
    }
}