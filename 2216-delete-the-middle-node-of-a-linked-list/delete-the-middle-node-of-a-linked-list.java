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
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(size == 1 || size == 0){
            return null;
        }
        System.out.print(size);
        temp = head;
        for(int i = 0; i < size/2 - 1; i++){
            temp = temp.next;
        }
        System.out.print(temp.val);
        ListNode prev = temp;
        if(temp.next != null){
          ListNode forw = temp.next;
          if(temp.next.next != null){

        prev.next = forw.next;
          }else{
            prev.next = null;
          }

        }

        return head;
    }
}