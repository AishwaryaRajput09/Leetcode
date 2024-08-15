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
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dia = 0;
        helper(root);
        return dia;

    }
    private int helper(TreeNode root){
        if(root == null) return 0;
        int maxLeft = helper(root.left);
        int maxRight = helper(root.right);
        dia = Math.max(dia,maxLeft + maxRight);
        return Math.max(maxLeft,maxRight) + 1;
    }
}