public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode temp2 = headB;
        int size1 = 0, size2 = 0;

        // Count size of the first list
        while (temp != null) {
            size1++;
            temp = temp.next;
        }

        // Count size of the second list
        while (temp2 != null) {
            size2++;
            temp2 = temp2.next;
        }

        // Reset temp and temp2 to the heads
        temp = headA;
        temp2 = headB;

        // Advance the pointer of the longer list
        for (int i = 0; i < Math.abs(size1 - size2); i++) {
            if (size1 > size2) {
                temp = temp.next;
            } else {
                temp2 = temp2.next;
            }
        }

        // Find the intersection node
        while (temp != temp2) {
            temp = temp.next;
            temp2 = temp2.next;
        }

        return temp; // Either temp or temp2 can be returned, as they now point to the intersection node.
    }
}
