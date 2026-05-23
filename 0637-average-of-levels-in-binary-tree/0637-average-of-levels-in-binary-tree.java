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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        double sumOfVal = 0, numOfVal = 0;
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    double temp = sumOfVal / numOfVal;
                    res.add(temp);
                    return res;
                }
                else{
                    q.add(null);
                    double temp = sumOfVal / numOfVal;
                    res.add(temp);
                    sumOfVal = 0;
                    numOfVal = 0;
                }
            }
            else{
                sumOfVal += currNode.val;
                numOfVal++;
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        return res;
    }
}