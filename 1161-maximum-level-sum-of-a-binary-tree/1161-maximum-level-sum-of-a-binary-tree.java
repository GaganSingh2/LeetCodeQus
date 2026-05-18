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
    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxLevel = 1, tmpLevel = 1;
        
        Queue<TreeNode> tmp = new LinkedList<>();
        tmp.add(root);
        tmp.add(null);
        int sum = Integer.MIN_VALUE, tempSum = 0;
        while(!tmp.isEmpty()){
            TreeNode currNode = tmp.remove();
            if(currNode == null){
                if(tempSum>sum){
                    sum = tempSum;
                    maxLevel = tmpLevel;
                }
                tempSum = 0;
                tmpLevel++;
                if(tmp.isEmpty()){
                    return maxLevel;
                }
                else{
                    tmp.add(null);
                }
            }
            else{
                tempSum += currNode.val;
                if(currNode.left != null){
                    tmp.add(currNode.left);
                } 
                if(currNode.right != null){
                    tmp.add(currNode.right);
                }
            }
        }
        return maxLevel;
    }
}