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
    int totalNodesCount = 0;
    private int countNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftCnt = countNodes(root.left);
        int rightCnt = countNodes(root.right);

        return leftCnt + rightCnt + 1;
    }
    public int sumOfNode(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);

        return leftSum + rightSum + root.val;
    }
    public int averageOfSubtree(TreeNode root) {
        if(root == null){
            return 0;
        }
        // if(root.left == null && root.right == null){
        //     return 1;
        // }

        int cntNode = countNodes(root);
        int sum = sumOfNode(root);
        if(sum / cntNode == root.val){
            totalNodesCount++;
        }
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);

        return totalNodesCount;
    }
}