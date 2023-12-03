/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode vals = node.next;
         node.val = vals.val;
         node.next = vals.next;
        //  node = vals;
        
    }
}