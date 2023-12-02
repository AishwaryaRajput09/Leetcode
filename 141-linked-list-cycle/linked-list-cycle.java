/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
    ListNode node = head;
    ListNode slow = head;
    // if(node == null){
    //     return false;
    // }
    while(node != null&&node.next != null){
        node=node.next.next;
        slow = slow.next;
        if(node == slow) return true;
     }
    
        return false;
    }
}