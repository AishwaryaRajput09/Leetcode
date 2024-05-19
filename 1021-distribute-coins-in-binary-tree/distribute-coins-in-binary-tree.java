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
    private int moves;
    public int distributeCoins(TreeNode root) {
       moves = 0;
       dfs(root);
       return moves;
    }
    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

    int leftBal = dfs(root.left);
    int rightBal = dfs(root.right);

    moves += Math.abs(leftBal) + Math.abs(rightBal);
    return root.val + leftBal + rightBal - 1;
    }
}