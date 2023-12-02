class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        return prev;
    }
}
