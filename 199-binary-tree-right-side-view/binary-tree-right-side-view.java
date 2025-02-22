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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightView(root, list, 0);
        return list;
    }
    public void rightView(TreeNode curr,List<Integer> list, int level){
        if(curr == null ) return;
        if(level == list.size()){
            list.add(curr.val);
        }
        rightView(curr.right, list, level+1);
        rightView(curr.left, list, level+1);
    }
}