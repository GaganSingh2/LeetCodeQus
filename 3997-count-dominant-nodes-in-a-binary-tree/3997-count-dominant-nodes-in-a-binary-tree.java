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
    public int totalDominantNode = 0;
    private int helper(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int leftMax = helper(root.left);
        int rightMax = helper(root.right);

        int maxValue = Math.max(root.val, Math.max(leftMax, rightMax));
        
        if(maxValue == root.val){
            totalDominantNode++;
        }

        return maxValue;
        
    }
    public int countDominantNodes(TreeNode root) {
        totalDominantNode = 0;
        helper(root);
        return totalDominantNode;
    }
}