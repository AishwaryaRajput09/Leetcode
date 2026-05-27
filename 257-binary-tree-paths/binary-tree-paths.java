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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if(root == null) return paths;
        StringBuilder op = new StringBuilder();
        
        dfsL(root, paths, op);
        // dfsR(root, paths, op);
        return paths;
    }
    public void dfsL(TreeNode node,List<String> paths , StringBuilder op){
        if(node == null) return;
        int len = op.length();
        op.append(node.val);
        if(node.left == null && node.right == null){
            paths.add(op.toString());
        }else{
        op.append("->");
        dfsL(node.left, paths, op);
        dfsL(node.right, paths, op);
        }
        op.setLength(len);
    }
}