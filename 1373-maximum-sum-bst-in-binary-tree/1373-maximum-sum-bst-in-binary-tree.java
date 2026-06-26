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
    static class Info{
        boolean isBST;
        int sum;
        int min;
        int max;

        Info(boolean isBST, int sum, int min, int max){
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }
    public int maxSum = 0;
    public Info infoOfNode(TreeNode root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = infoOfNode(root.left);
        Info rightInfo = infoOfNode(root.right);

        int currSum = leftInfo.sum + rightInfo.sum + root.val;
        int currMin = Math.min(root.val , Math.min(leftInfo.min, rightInfo.min));
        int currMax = Math.max(root.val, Math.max(leftInfo.max, rightInfo.max));

        if(leftInfo.isBST && rightInfo.isBST && root.val > leftInfo.max && root.val < rightInfo.min){
            maxSum = Math.max(currSum, maxSum);
            return new Info(true, currSum, currMin, currMax);
        }
        return new Info(false, currSum, currMin, currMax);
    }
    public int maxSumBST(TreeNode root) {
        if(root == null){
            return 0;
        }
        maxSum = 0;
        Info info = infoOfNode(root);
        return maxSum;
    }
}




















