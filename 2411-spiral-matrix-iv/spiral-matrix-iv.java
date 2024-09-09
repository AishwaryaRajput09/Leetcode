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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][] mat = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = -1;
            }
        }
        ListNode curr = head;
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right && curr != null ; i++){
                    mat[top][i] = curr.val;
                    curr = curr.next;
            }
            top++;
            for(int i = top; i <= bottom && curr != null; i++){
                mat[i][right] = curr.val;
                curr = curr.next;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left && curr != null; i--){
                    mat[bottom][i] = curr.val;
                    curr = curr.next;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top && curr != null; i--){
                    mat[i][left] = curr.val;
                    curr = curr.next;                }
            left++;
            }
        }
        return mat;
    }
}