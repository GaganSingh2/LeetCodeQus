/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }

        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);//check in left SubTree
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);//check in right SubTree

        if(leftLCA == null){ //rightLCA != null && leftLCA == null, so rightLCA
            return rightLCA;
        }
        if(rightLCA == null){ //rightLCA == null && leftLCA != null, so leftLCA
            return leftLCA;
        }

        return root; //leftLCA != null && rightLCA != null means root is result
    }
}