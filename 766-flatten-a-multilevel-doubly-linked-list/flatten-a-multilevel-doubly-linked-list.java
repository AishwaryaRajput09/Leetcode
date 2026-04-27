/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null)
            return head;
       
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {

                Node forw = curr.next;

                curr.child.prev = curr;
                curr.next = curr.child;
                curr.child = null;

                Node temp = curr.next;
                
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = forw;
                if (forw != null) {
                    forw.prev = temp;
                }
            }

            curr = curr.next;
        }
        return head;
    }
}