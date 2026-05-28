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
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        idx = n-1;
        return solve(inorder, postorder, 0, n-1);
    }
    private TreeNode solve(int[] inorder, int[] postorder, int start, int end){
        if(start > end){
            return null;
        }
        int rootVal = 0;
        if(idx >= 0) rootVal = postorder[idx];
        int i;
        for(i = start; i < end; i++){
            if(inorder[i] == rootVal){
                break;
            }
        }
        idx--;
        TreeNode root = new TreeNode(rootVal);
        root.right = solve(inorder, postorder, i+1, end);
        root.left = solve(inorder, postorder, start, i-1);
    return root;
    }
}