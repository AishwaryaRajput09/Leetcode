/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

    public TreeNode dfs(TreeNode node, TreeNode p, TreeNode q) {
        if (node == p || node == q || node == null) {
            return node;
        }
        TreeNode leftN = dfs(node.left, p, q);
        TreeNode rightN = dfs(node.right, p, q);
        if (leftN != null && rightN != null) return node;
        if (leftN != null) return leftN;
        return rightN;
    }
}