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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        // if(temp == null) return temp;
        temp = temp.next;
        while(temp != null){
            int sum = 0;
            while(temp != null && temp.val != 0 ){
                sum += temp.val;
                temp = temp.next;
            } 
            
                list.add(sum);
            
            if (temp != null) temp = temp.next;
        }
        if (list.isEmpty()) return null;
        ListNode result = new ListNode(list.get(0));
        ListNode curr = result;
        for(int i = 1; i < list.size(); i++){
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        // result.next = null;
       
        return result;
    }
}