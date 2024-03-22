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
         if (head == null) {
            return true;
        }
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
       }
       ListNode secHalf = rev(slow);
      
       ListNode f = head;
       while(secHalf != null){
        if(f.val != secHalf.val){
            return false;
        }
        f = f.next;
        secHalf = secHalf.next;
       }
       return true;
    }
   private ListNode rev(ListNode head){
    ListNode prev  = null;
    ListNode temp = head;
    while(temp != null){
        ListNode nxt = temp.next;
        temp.next = prev;
        prev = temp;
        temp = nxt;
    }
    return prev;
}
}