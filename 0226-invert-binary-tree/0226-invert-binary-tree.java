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
    public TreeNode invertTree(TreeNode root) {
        //1st Approach by Using Recursion---------------------
        // if(root == null){
        //     return null;
        // }

        // TreeNode tempNode = root.left;
        // root.left = root.right;
        // root.right = tempNode;

        // invertTree(root.left);
        // invertTree(root.right);

        // return root;

        //2nd Approach by Using Level Order Traversal------------------
        if(root == null){
            return null;
        }
        return invertUsingLevelOrderTraversal(root);

    }

    private TreeNode invertUsingLevelOrderTraversal(TreeNode root){
        if(root == null){
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    return root;
                }
                else{
                    q.add(null);
                }
            }
            else{
                TreeNode tempNode = currNode.left;
                currNode.left = currNode.right;
                currNode.right = tempNode;
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        return root;
    }
}