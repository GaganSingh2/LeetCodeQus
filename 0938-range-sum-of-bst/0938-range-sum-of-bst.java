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
    public int totalSum = 0;
    public void sumOfBST(TreeNode root, int low, int high){
        if(root == null){
            return;
        }
        if(root.val >= low && root.val <= high){
            
            sumOfBST(root.left, low, high);
            totalSum += root.val;
            sumOfBST(root.right,low, high);
        }
        //means entire leftSubTree is invalid
        else if(root.val < low){
            sumOfBST(root.right, low, high);
        }
        //otherwise entire rightSubTree is invalid
        else{
            sumOfBST(root.left, low, high);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return -1;
        }
        totalSum = 0;
        sumOfBST(root, low, high);
        return totalSum;
        
    }
}