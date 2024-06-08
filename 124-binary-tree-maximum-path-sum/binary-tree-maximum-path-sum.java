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
    int sum;
    public int maxPathSum(TreeNode root) {
        sum = Integer.MIN_VALUE;
        traversal(root);
        return sum;
    }
    private int traversal(TreeNode root){

        if(root == null){
            return 0;
        }
        int lt = Math.max(traversal(root.left),0);

        int rt = Math.max(traversal(root.right),0);
        
        int currPrice = root.val + lt + rt;
        
        sum = Math.max(sum , currPrice);

        return root.val + Math.max(lt,rt);
        
    }
}