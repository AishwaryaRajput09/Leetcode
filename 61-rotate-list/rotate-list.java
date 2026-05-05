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
        if(head == null || k == 0) return head;
        ListNode node = head;
        int size = 1;
        while(node.next != null){
            node = node.next;
            size++;
        }
        k = k % size;
        System.out.println(k);
        node.next = head;
        ListNode end = node.next;
        for(int i = 0; i < size - k - 1; i++){
            end = end.next;
        }
        head = end.next;
        end.next = null;
    return head;
    }
}