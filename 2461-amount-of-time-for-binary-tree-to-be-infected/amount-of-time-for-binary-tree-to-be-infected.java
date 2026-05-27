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
    HashMap<TreeNode, TreeNode> parent = new HashMap<>();
    TreeNode target;
    // int ans;

    void Inorder(TreeNode node, int start) {
        if (node == null)
            return;
        if (node.val == start)
            target = node;
        if (node.left != null) {
            parent.put(node.left, node);
        }
        Inorder(node.left, start);
        if (node.right != null) {
            parent.put(node.right, node);
        }
        Inorder(node.right,start);
    }

    public int amountOfTime(TreeNode root, int start) {
        int ans = 0;
        if(root == null) return 0;
        Inorder(root, start);
        Queue<TreeNode> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        visited.add(target.val);
        q.offer(target);
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null && !visited.contains(curr.left.val)) {
                    q.offer(curr.left);
                    visited.add(curr.left.val);
                }
                if (curr.right != null && !visited.contains(curr.right.val)) {
                    q.offer(curr.right);
                    visited.add(curr.right.val);
                }
                if (parent.containsKey(curr) && !visited.contains(parent.get(curr).val)) {
                    q.offer(parent.get(curr));
                    visited.add(parent.get(curr).val);
                }
            }
            ans++;
        }
        return ans-1;
    }
}