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
    public Integer prev = null;
    public int min = Integer.MAX_VALUE;
    public void getMin(TreeNode root){
        if(root == null){
            return;
        }
        getMin(root.left);
        if(prev != null){
            min = Math.min(min, root.val-prev);
        }
        prev = root.val;
        getMin(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return -1;
        }
        min = Integer.MAX_VALUE;
        getMin(root);
        // System.out.println(firstMin+" "+secondMin);
        return min;
    }
}