class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int pSum) {
        if (node == null){
            return 0;
        }
        pSum = pSum * 10 + node.val;
        
        if (node.left == null && node.right == null){
            return pSum;
        }
        return dfs(node.left, pSum) + dfs(node.right, pSum);
    }
}