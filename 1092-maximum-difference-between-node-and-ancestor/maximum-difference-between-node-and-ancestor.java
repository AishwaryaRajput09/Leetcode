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
    public int maxAncestorDiff(TreeNode root) {
        int diff[]= new int[]{0};
        dfs(root,root.val,root.val,diff);
       return diff[0];
    } private void dfs(TreeNode node,int max,int min , int[] diff){
        // int max = Integer_MIN_VALUE;
        // int min = Integer_MAX_VALUE;
        if(node == null){
            return;
        }
       max = Math.max(max,node.val);
       min = Math.min(min,node.val);
        diff[0] = Math.max(diff[0],max-min);
        dfs(node.left,max,min,diff);
        dfs(node.right,max,min,diff);
        // return diff;
    }
}