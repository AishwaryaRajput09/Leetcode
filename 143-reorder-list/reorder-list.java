class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        
        // Detect cycle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                throw new RuntimeException("Error - Found cycle in the ListNode");
            }
        }
        
        // Find the midpoint
        ListNode mid = slow;
        ListNode secondHalf = reverse(mid.next);
        mid.next = null; // Break the list into two parts
        
        // Merge the two halves
        merge(head, secondHalf);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    private void merge(ListNode first, ListNode second) {
        while (second != null) {
            ListNode nextFirst = first.next;
            ListNode nextSecond = second.next;
            
            first.next = second;
            second.next = nextFirst;
            
            first = nextFirst;
            second = nextSecond;
        }
    }
}
