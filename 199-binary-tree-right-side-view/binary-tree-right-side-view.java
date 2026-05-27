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
    class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, TreeNode> map = new TreeMap<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            int level = p.level;
            if(!map.containsKey(level)){
                map.put(level, node);
            }
            if(node.right != null){
                q.offer(new Pair(node.right, level+1));
            }
            if(node.left != null){
                q.offer(new Pair(node.left, level+1));
            }

        }
        for(TreeNode node: map.values()){
            list.add(node.val);
        }
        return list;
    }
}