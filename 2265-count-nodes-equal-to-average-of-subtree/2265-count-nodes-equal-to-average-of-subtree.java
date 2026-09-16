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
    //Approach- 2nd using Tree & DFS------------- TC: O(n)
    int totalNodesCount = 0;
    private int[] trav(TreeNode root){
        if(root == null){
            return new int[]{0,0};
        }
        int left[] = trav(root.left);
        int right[] = trav(root.right);

        int subTreeSum = left[0] + right[0] + root.val;
        int subTreeCount = left[1] + right[1] + 1;

        if(subTreeSum / subTreeCount == root.val) {
            totalNodesCount++;
        }

        return new int[]{subTreeSum, subTreeCount};
    }
    public int averageOfSubtree(TreeNode root){
        trav(root);
        return totalNodesCount;
    }

    //Approach-1st using Tree & Recursion-------- TC: O(n^2)

    // int totalNodesCount = 0;
    // private int countNodes(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int leftCnt = countNodes(root.left);
    //     int rightCnt = countNodes(root.right);

    //     return leftCnt + rightCnt + 1;
    // }
    // private int sumOfNode(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int leftSum = sumOfNode(root.left);
    //     int rightSum = sumOfNode(root.right);

    //     return leftSum + rightSum + root.val;
    // }
    // public int averageOfSubtree(TreeNode root) {
    //     if(root == null){
    //         return 0;
    //     }

    //     int cntNode = countNodes(root);
    //     int sum = sumOfNode(root);
    //     if(sum / cntNode == root.val){
    //         totalNodesCount++;
    //     }
    //     averageOfSubtree(root.left);
    //     averageOfSubtree(root.right);

    //     return totalNodesCount;
    // }
}