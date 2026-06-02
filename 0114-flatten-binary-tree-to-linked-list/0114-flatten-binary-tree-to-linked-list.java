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
    public void flatten(TreeNode root) {
        //1st Approach by Using Recursion----------------
        if(root == null){
            return;
        }
        List<TreeNode> nodes = new ArrayList<>();
        preorderTraversal(root, nodes);

        for(int i=0; i<nodes.size()-1; i++){
            nodes.get(i).left = null;
            nodes.get(i).right = nodes.get(i+1);
        }
    }
    
    private void preorderTraversal(TreeNode root, List<TreeNode> nodes){
        if(root == null){
            return;
        }
        nodes.add(root);
        preorderTraversal(root.left, nodes);
        preorderTraversal(root.right, nodes);
    }
}