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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        int firstCritical = -1;
        int lastCritical = -1;
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;

        while (curr.next != null) {
            ListNode next = curr.next;
            if ((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)) {
                if (firstCritical == -1) {
                    firstCritical = index;
                } else {
                    minDistance = Math.min(minDistance, index - lastCritical);
                }
                lastCritical = index;
                maxDistance = index - firstCritical;
            }
            prev = curr;
            curr = next;
            index++;
        }

        if (firstCritical == lastCritical) return new int[] {-1, -1};

        return new int[] {minDistance, maxDistance};
    }
}