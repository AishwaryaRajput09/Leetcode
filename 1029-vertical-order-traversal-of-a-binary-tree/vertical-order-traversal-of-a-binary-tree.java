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
    class NodeWithValue {
    TreeNode node;
    int value1;
    int value2;
    
    NodeWithValue(TreeNode node, int value1, int value2) {
        this.node = node;
        this.value1 = value1;
        this.value2 = value2;
    }
}
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<NodeWithValue> q = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        q.offer(new NodeWithValue(root,0,0));
        while(!q.isEmpty()){
            NodeWithValue ndv = q.poll();
            TreeNode node = ndv.node;
            int x = ndv.value1;
            int y = ndv.value2;
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);
            if(node.left != null){
                q.offer(new NodeWithValue(node.left,x-1,y+1));
            }
            if(node.right != null){
                q.offer(new NodeWithValue(node.right,x+1,y+1));
            }
        }
        for(TreeMap<Integer, PriorityQueue<Integer>> ys: map.values()){
            result.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes: ys.values()){
                while(!nodes.isEmpty()){
                    result.get(result.size()-1).add(nodes.poll());
                }
            }
        }
        return result;
    }
}