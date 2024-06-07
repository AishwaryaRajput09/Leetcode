/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 1;
    public boolean isBalanced(TreeNode root) {
      height(root);
      
      return ans == 1;
    }
    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lt = height(root.left);
        int rt = height(root.right);
        if(Math.abs(lt-rt) > 1) {
            ans = 0;
            }
        return Math.max(lt ,rt) + 1;
    }
}