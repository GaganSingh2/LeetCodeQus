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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> tmp = new LinkedList<>();
        tmp.add(root);
        tmp.add(null);
        ArrayList<Integer> temp = new ArrayList<>();
        while(!tmp.isEmpty()){
            TreeNode currNode = tmp.remove();
            if(currNode == null){
                if(tmp.isEmpty()){
                    res.add(temp);
                    return res;
                }
                else{
                    res.add(temp);
                    tmp.add(null);
                     temp = new ArrayList<>();
                }
               
            }
            else{
                temp.add(currNode.val);
                if(currNode.left != null){
                    tmp.add(currNode.left);
                }
                if(currNode.right != null){
                    tmp.add(currNode.right);
                }
            
            }
        }
        return res;
    }
}












