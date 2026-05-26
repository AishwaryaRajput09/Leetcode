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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        helper(root, res, q);
        return res;
    }
    private void helper(TreeNode node, List<List<Integer>> res,Queue<TreeNode> q){
        q.add(node);
            boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i = 0; i < size; i++){       
            TreeNode curr = q.poll();
            ans.add(curr.val);
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
            }
            if(!flag){
                Collections.reverse(ans);
            }
            res.add(ans);
            flag = !flag;
        }
    }

}