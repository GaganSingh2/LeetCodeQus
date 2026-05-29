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
    public void solve(TreeNode root, List<String> res, StringBuilder path){
        if(root == null){
            return;
        }
        int len = path.length();
        if(path.length() != 0){
            path.append("->");
        }
        path.append(root.val);
        
        if(root.left == null && root.right == null){
            res.add(path.toString());
            // return;
        }else{
            solve(root.left, res,path);
            solve(root.right,res,path);
        }
        path.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> res = new ArrayList<>();
       
        solve(root, res, new StringBuilder(""));
        return res;
    }

    
}