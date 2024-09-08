// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     int i = 0;
//     public ListNode[] splitListToParts(ListNode head, int k) {
//         ListNode[] list = new ListNode[k];
//         if(head == null) return list;
//         ListNode temp = head;
//         int size = 0;
//         while(temp != null){
//             size++;
//             temp = temp.next;
//         }
//         temp = head;
//     if(size <= k){
//         // ListNode forw = temp.next;
//         for(i = 0; i < size; i++){
//             ListNode curr = temp;
//             temp = temp.next;
//             curr.next = null;
            
//             list[i] = curr;
//         }

//     }
//     int rem = size % k;
//     int part = size / k;
//     temp  = head;
//     for(int j = 0; j < k; j++){
//         if(rem > 0){

//         for(i = i ; i < k + rem; i++){
//             ListNode curr = temp;
//             temp = temp.next;
//             if(i )
//         }
//         }
//     }
//     return list;
//     }
// }
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] list = new ListNode[k];
        if (head == null) return list;

        // Calculate the size of the linked list
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Determine the size of each part and the remainder (extra nodes)
        int partSize = size / k;
        int rem = size % k;
        
        temp = head;

        // Split the list into parts
        for (int i = 0; i < k; i++) {
            ListNode curr = temp;
            list[i] = curr;
            
            // Calculate the current part size (some parts get an extra node if rem > 0)
            int currPartSize = partSize + (rem > 0 ? 1 : 0);
            rem--;

            // Move temp forward by currPartSize, and break the link
            for (int j = 0; j < currPartSize - 1; j++) {
                if (temp != null) temp = temp.next;
            }
            
            // Break the list if temp is not null
            if (temp != null) {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }

        return list;
    }
}
