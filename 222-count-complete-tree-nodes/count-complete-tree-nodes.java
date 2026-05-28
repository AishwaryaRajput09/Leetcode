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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int lh = getLeftNode(root);
        int rh = getRightNode(root);
        if(lh == rh) return (int) Math.pow(2, lh) - 1;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    int getLeftNode(TreeNode node){
        if(node == null) return 0;
        return 1 + getLeftNode(node.left);
    }
    int getRightNode(TreeNode node){
        if(node == null) return 0;
        return 1 + getRightNode(node.right);
    }
}