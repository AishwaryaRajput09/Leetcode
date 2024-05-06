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
    public ListNode removeNodes(ListNode head) {
        ListNode curr = head;
        int size = 0;
        ListNode prev = null;
        while(curr != null){
        ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
         }
         ListNode temp = prev;
         int max = Integer.MIN_VALUE;
         while(temp != null && temp.next != null){
            max = Math.max(max,temp.val);
            if(temp.next.val < max){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
         }
          curr = prev;
          prev = null;
          while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
          }
         return prev;
        
    }

}