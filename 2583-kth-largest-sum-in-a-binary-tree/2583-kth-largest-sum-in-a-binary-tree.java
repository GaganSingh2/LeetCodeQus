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
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> temp = new ArrayList<>();
        if(root == null || k<1){
            return -1;
        }
        long sumData = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    temp.add(sumData);
                    break;
                }
                else{
                    temp.add(sumData);
                    q.add(null);
                    sumData = 0;
                }
            }
            else{
                sumData += currNode.val;
                if(currNode.left != null){
                    q.add(currNode.left);
                } 
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        Collections.sort(temp, Collections.reverseOrder());
        for(int i=0; i<=temp.size()-1; i++){
            if(i == k-1){
                return temp.get(i);
            }
            // System.out.println(temp.get(i));
        }
        return -1;
    }
}