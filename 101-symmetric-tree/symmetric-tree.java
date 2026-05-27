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
    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        if(root == null) return true;
        leftTree(root, left);
        rightTree(root, right);
        if(left.size() != right.size()) return false;
        for(int i = 0; i < left.size(); i++){
            if(left.get(i) != right.get(i)){
                return false;
            }
        }
        return true;
    }
    public void leftTree(TreeNode node, ArrayList<Integer> lt){
        if(node == null) {
            lt.add(null);
            return;
        }
        lt.add(node.val);
        leftTree(node.left, lt);
        leftTree(node.right, lt);
    }
    public void rightTree(TreeNode node, ArrayList<Integer> rt){
        if(node == null) {
            rt.add(null);
            return;
        }
        rt.add(node.val);
        rightTree(node.right, rt);
        rightTree(node.left, rt);
    }
}