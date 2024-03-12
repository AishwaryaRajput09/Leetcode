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
public class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        int prefixSum = 0;

        while (curr != null) {
            prefixSum += curr.val;
            map.put(prefixSum, curr);
            curr = curr.next;
        }

        curr = dummy;
        prefixSum = 0;

        while (curr != null) {
            prefixSum += curr.val;
            curr.next = map.get(prefixSum).next;
            curr = curr.next;
        }

        return dummy.next;
    }
}
