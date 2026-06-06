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
    public int findBottomLeftValue(TreeNode root) {
        if(root == null){
            return -1;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int leftVal = root.val;
        int cnt = 1;
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    return leftVal;
                }
                else{
                    q.add(null);
                    cnt++;
                }
            }
            else{
                if(cnt == 1){
                    leftVal = currNode.val;
                    cnt = 0;
                }
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        return leftVal;
    }
}










