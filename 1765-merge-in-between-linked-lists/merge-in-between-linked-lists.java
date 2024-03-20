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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = getP(a-1,list1);
        ListNode forw = getP(b+1, list1);
        prev.next = list2;
        ListNode temp = list2;
        while(temp.next != null){
            temp = temp.next;
        
        }
        temp.next = forw;
        return list1;
    }
    ListNode getP(int ind,ListNode node){
        ListNode head = node;
        for(int i = 0; i < ind; i++){
            head = head.next;
        }
        return head;
    }
}