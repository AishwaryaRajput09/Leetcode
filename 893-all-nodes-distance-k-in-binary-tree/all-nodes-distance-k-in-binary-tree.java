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
    HashMap<TreeNode, TreeNode> parent = new HashMap<>();
    void inorder(TreeNode node){
        if(node == null) return;
        if(node.left != null){
            parent.put(node.left, node);
        }
        inorder(node.left);
        if(node.right != null){
            parent.put(node.right, node);
        }
        inorder(node.right);
    }
    void Bfs(TreeNode target, int k, List<Integer> res){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        Set<Integer> visited = new HashSet<>();
        visited.add(target.val);
        int level = 0;
        while(!q.isEmpty()){
            int n = q.size();
            if(k == 0){
                break;
            }
            for(int i = 0; i< n; i++){
                TreeNode curr = q.poll();
                if(curr.left != null && !visited.contains(curr.left.val)){
                    q.offer(curr.left);
                    visited.add(curr.left.val);
                }
                if(curr.right != null && !visited.contains(curr.right.val)){
                    q.offer(curr.right);
                    visited.add(curr.right.val);
                }
                if(parent.containsKey(curr) && !visited.contains(parent.get(curr).val)){
                    q.offer(parent.get(curr));
                    visited.add(parent.get(curr).val);
                }
            }
                k--;
        }
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            res.add(curr.val);
        }
        // return res;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();
         inorder(root);
         Bfs(target, k, res);
         return res;
    }
}