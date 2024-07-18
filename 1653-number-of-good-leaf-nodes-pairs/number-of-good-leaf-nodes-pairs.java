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
    public int countPairs(TreeNode root, int distance) {
        int[] result = new int[1]; // Use an array to store the result since we need to modify it inside dfs.
        dfs(root, distance, result);
        return result[0];
    }
    
    private List<Integer> dfs(TreeNode node, int distance, int[] result) {
        if (node == null) return new ArrayList<>();
        
        if (node.left == null && node.right == null) {
            List<Integer> leaves = new ArrayList<>();
            leaves.add(1);
            return leaves;
        }
        
        List<Integer> leftDistances = dfs(node.left, distance, result);
        List<Integer> rightDistances = dfs(node.right, distance, result);
        
        // Count pairs
        for (int leftDist : leftDistances) {
            for (int rightDist : rightDistances) {
                if (leftDist + rightDist <= distance) {
                    result[0]++;
                }
            }
        }
        
        // Increase distance by 1 for the parent node
        List<Integer> currentDistances = new ArrayList<>();
        for (int leftDist : leftDistances) {
            if (leftDist + 1 <= distance) {
                currentDistances.add(leftDist + 1);
            }
        }
        for (int rightDist : rightDistances) {
            if (rightDist + 1 <= distance) {
                currentDistances.add(rightDist + 1);
            }
        }
        
        return currentDistances;
    }
}
