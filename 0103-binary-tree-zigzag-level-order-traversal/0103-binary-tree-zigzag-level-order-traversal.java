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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        List<Integer> path = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 0;
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    if(level % 2 == 0){
                        ans.add(path);
                    }
                    else{
                        Collections.reverse(path);
                        ans.add(path);
                    }
                    return ans;
                }
                else{
                    if(level % 2 == 0){
                        ans.add(path);
                    }
                    else{
                        Collections.reverse(path);
                        ans.add(path);
                    }
                    path = new ArrayList<>();
                    level++;
                    q.add(null);
                }
            }
            else{
                path.add(currNode.val);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        return ans;
    }
}