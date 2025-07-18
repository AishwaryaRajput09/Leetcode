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
    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        return helper(nums, left, right);
        
    }
    TreeNode helper(int[] nums, int l, int r){
        if(l > r) return null;

        int mid = l + (r - l) / 2; 
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, l, mid-1);
        node.right = helper(nums, mid+1, r);

        return node;
    }
}