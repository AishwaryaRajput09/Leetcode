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
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if(root == null) return true;
        leftT(root,list);
        rightT(root,list2);
        if(list.size() != list2.size()) return false;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != list2.get(i)) return false;
        }
        return true;
    }
    private void leftT(TreeNode node,List<Integer> list){
        if(node == null){
            list.add(null);
            return;
        }
        list.add(node.val);
        leftT(node.left,list);
        leftT(node.right,list);

    }
    private void rightT(TreeNode node,List<Integer> list2){
        if(node == null){
            list2.add(null);
            return;
        }
        list2.add(node.val);
        rightT(node.right,list2);
        rightT(node.left,list2);

    }
}