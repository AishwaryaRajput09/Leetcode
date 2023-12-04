class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        int size = 0;

        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int tar = size - n;
        ListNode prev = get(dummy, tar);

        if (n >= 2) {
            prev.next = prev.next.next;
        } else {
            prev.next = null;
        }

        return dummy.next;
    }

    private ListNode get(ListNode head, int ind) {
        for (int i = 0; i < ind; i++) {
            head = head.next;
        }
        return head;
    }
}
