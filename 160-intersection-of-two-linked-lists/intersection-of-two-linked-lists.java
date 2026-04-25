/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr_A = headA;
        ListNode ptr_B = headB;

        while(ptr_A != ptr_B){
            ptr_A = (ptr_A != null) ? ptr_A.next: headB;
            ptr_B = (ptr_B != null) ? ptr_B.next: headA;
        }
        return ptr_A;
    }
}