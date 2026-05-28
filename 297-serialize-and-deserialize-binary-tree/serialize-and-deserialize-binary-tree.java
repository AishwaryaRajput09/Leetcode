/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    StringBuilder tree = new StringBuilder();
    int idx = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            tree.append("#,");
            return tree.toString();
        }
        tree.append(root.val).append(",");
        // size++;
         serialize(root.left);
        serialize(root.right);
        return tree.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(","); 
        return build(nodes);
    }
    
    public TreeNode build(String[] nodes){
        if(idx >= nodes.length || nodes[idx].equals("#")){
            idx++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[idx]));
        idx++;
        root.left = build(nodes);
        root.right = build(nodes);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));