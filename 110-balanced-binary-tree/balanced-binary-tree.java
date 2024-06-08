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
    // int ans = 1;
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;

    }
    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lt = height(root.left);
        if(lt == -1) return -1;
        int rt = height(root.right);
        if(rt == -1) return -1;

        if(Math.abs(lt-rt) > 1) {
            return -1;
            }
        return Math.max(lt ,rt) + 1;
    }
}