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
    public TreeNode foundInorderSuccessor(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }

        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            //Case 1: leaf Node (Node has no child)
            if(root.left == null && root.right == null){
                return null;
            }
            //Case 2: Node has one Child
            //root.left == null means root.right != null
            else if(root.left == null){
                return root.right;
            }
            //root.right == null means root.left != null
            else if(root.right == null){
                return root.left;
            }
            else{
                //Case 3: Node has 2 children
                //found the Inorder Successor
                TreeNode inorderSuccessor = foundInorderSuccessor(root.right);
                //replace the original value with Inorder Successor value
                root.val = inorderSuccessor.val;
                //delete the Inorder Successor node
                root.right = deleteNode(root.right, inorderSuccessor.val);
            }
        }
        return root;
    }
}
/**
Inorder Successor: Left most node in right SubTree of the given node for delete to find the closet or minimum value
 */




















