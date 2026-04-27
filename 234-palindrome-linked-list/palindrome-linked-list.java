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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secHalf = reverseLinkedList(slow);
        fast = head;
        while(secHalf != null){
            if(fast.val != secHalf.val) return false;
            secHalf = secHalf.next;
            fast = fast.next;
        }
        return true;

    }
    private ListNode reverseLinkedList(ListNode node){
        ListNode prev = null;
        while(node != null){
            ListNode forw = node.next;
            node.next = prev;
            prev = node;
            node = forw;
        }
        return prev;
    }
}