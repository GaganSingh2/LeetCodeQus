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
    private void pathStore(TreeNode root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        pathStore(root.left, path);
        path.add(root.val);
        pathStore(root.right, path);
    }
    private TreeNode createTree(TreeNode rootN, int val){
        if(rootN == null){
            rootN = new TreeNode(val);
            return rootN;
        }
        rootN.right = createTree(rootN.right, val);
        return rootN;
    }
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return null;
        }
        ArrayList<Integer> path = new ArrayList<>();
        pathStore(root, path);
        TreeNode rootN = null;
        for(int i=0; i<path.size(); i++){
            // System.out.print(path.get(i)+" ");
            rootN = createTree(rootN, path.get(i));
        }
        return rootN;
    }
}