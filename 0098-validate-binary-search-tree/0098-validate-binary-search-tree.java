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
    private void storePath(TreeNode root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        storePath(root.left, path);
        path.add(root.val);
        storePath(root.right, path);
    }

    private boolean validateBST(TreeNode root, TreeNode min, TreeNode max){
        if(root == null){
            return true;
        }

        if(min != null && root.val <= min.val){
            return false;
        }
        else if(max != null && root.val >= max.val){
            return false;
        }
        // In Left Subtree All nodes must be: < root.val so min = null and max = root
        boolean isLeft = validateBST(root.left, min, root);
        // In Right Subtree All nodes must be: > root.val so min = root and max = null
        boolean isRight = validateBST(root.right, root, max);
        return isLeft && isRight;
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        //1st Approach store the min and max value for each root
        TreeNode min = null;
        TreeNode max = null;
        return validateBST(root, min, max);

        //2nd Approach using InOrder Traversal(if path sorted in Ascending order means it is valid)
        // ArrayList<Integer> path = new ArrayList<>();
        // storePath(root, path);
        // for(int i=1; i<=path.size()-1; i++){
        //     if(path.get(i-1)>path.get(i) || path.get(i-1)==path.get(i)){
        //         return false;
        //     }
        // }
        // return true;
        
    }
}