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
    private boolean isMirror(TreeNode leftSub, TreeNode rightSub){
        //if both nodes are null, means true
        if(leftSub == null && rightSub == null){
            return true;
        }

        //if one node is null and second node is not null  or if data is not same then not a symmetric Tree
        if((leftSub == null || rightSub == null) || (leftSub.val != rightSub.val)){
            return false;
        }

        //then check in mirror condition
        boolean leftHalf = isMirror(leftSub.left, rightSub.right);
        boolean rightHalf = isMirror(leftSub.right, rightSub.left);

        return leftHalf && rightHalf;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return isMirror(root.left, root.right);
    }
}