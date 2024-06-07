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
    public List<Integer> postorderTraversal(TreeNode root) {
    // if(this sol){
    //     List<Integer> list = new ArrayList<>();
    //     Stack<TreeNode> st1 = new Stack<>();
    //     Stack<TreeNode> st2 = new Stack<>();
    //     // TreeNode node = root;
    //     if(root == null){
    //         return list;
    //     }
    //              while(!st1.isEmpty()){
    //         root = st1.pop();
    //         st2.add(root);
    //         if(root.left != null) st1.push(root.left);
    //         if(root.right != null) st1.push(root.right);
    //     }
    //         while(!st2.isEmpty()){
    //             list.add(st2.pop().val);
    //         }
    // }
    //     return list;
    
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        TreeNode lastVisit = null;
        while(!st.isEmpty() || node != null){
            if(node != null){
                st.push(node);
                node = node.left;
            }else{
                TreeNode peekNode = st.peek();
                if(peekNode.right != null && lastVisit != peekNode.right){
                    node = peekNode.right;
                }else{
                    st.pop();
                    list.add(peekNode.val);
                    lastVisit = peekNode;
                }
            }
            
        }
        return list;
    }
}