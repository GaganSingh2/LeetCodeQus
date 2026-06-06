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
    private boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }

        if((root == null || subRoot == null) || (root.val != subRoot.val)){
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }

        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }

        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null){
            return false;
        }

        //if both value means this is the subRoot of Tree, so check subTree is identical or not 
        if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        //otherwise find the subRoot in leftSubTree or RightSubTree of Tree
        boolean isLeftIdentical = isSubtree(root.left, subRoot);
        boolean isRightIdentical = isSubtree(root.right, subRoot);

        return isLeftIdentical || isRightIdentical;
    }
}











