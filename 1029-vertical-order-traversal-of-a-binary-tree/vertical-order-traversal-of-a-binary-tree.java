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
    class Tuple{
        TreeNode node;
        int level;
        int axis;

        Tuple(TreeNode node, int level, int axis){
            this.node = node;
            this.level = level;
            this.axis = axis;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Tuple> q = new LinkedList<>();
        //map to store order orderly and priority queue in case of overlapping elementwe can take min val's first
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()){
            Tuple curr = q.poll();
            TreeNode node = curr.node;
            int axis = curr.axis;
            int level = curr.level;
            if(!map.containsKey(axis)){
                map.put(axis, new TreeMap<>());
            }
            if(!map.get(axis).containsKey(level)){
                map.get(axis).put(level, new PriorityQueue<>());
            }
            map.get(axis).get(level).offer(node.val);
            if(node.left != null){
                q.offer(new Tuple(node.left, level + 1, axis - 1));
            }
            if(node.right != null){
                q.offer(new Tuple(node.right, level + 1, axis + 1));
            }
        }
        //moment of the truth haha
        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()){
            res.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes: ys.values()){
                while(!nodes.isEmpty()){
                res.get(res.size()-1).add(nodes.poll());
                }
            }
        }
        return res;
    }
}