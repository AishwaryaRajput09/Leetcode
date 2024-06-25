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
    public TreeNode bstToGst(TreeNode root) {
         int sum = 0;
         revInorder(root,sum);
         return root;

    }
    private int revInorder(TreeNode node,int sum){
        if(node == null) return sum;

        sum = revInorder(node.right,sum);
        sum += node.val;
        node.val = sum;
        sum = revInorder(node.left,sum);
        
        return sum;
    }
}