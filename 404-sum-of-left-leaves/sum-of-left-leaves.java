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
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root);
    }
    public int dfs(TreeNode root){
         int sum = 0;
        if(root == null){
            return 0;
        }
       if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                sum += root.left.val;
            }else{
                sum += dfs(root.left);
            }
       }
       sum += dfs(root.right);
       
        return sum;
    }
    // return sum;
}