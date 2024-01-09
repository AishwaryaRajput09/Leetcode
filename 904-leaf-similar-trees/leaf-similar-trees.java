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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leafValue1 = new ArrayList<>();
        ArrayList<Integer> leafValue2 = new ArrayList<>();
        dfs(root1,leafValue1);
        dfs(root2,leafValue2);
        return leafValue1.equals(leafValue2);
    }
    private void dfs(TreeNode node, ArrayList<Integer> leafValues){
        if(node == null){
            return;
        }
        if(node.left == null && node.right==null){
            leafValues.add(node.val);
            return;
        }

        dfs(node.left,leafValues);
        dfs(node.right,leafValues);
    }
}