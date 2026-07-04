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
    //Helper method of Approach-1 
    public void inOrderTraversalAndArrayList(TreeNode root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        inOrderTraversalAndArrayList(root.left, path);
        path.add(root.val);
        inOrderTraversalAndArrayList(root.right, path);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        //Approach-1 using InOrder Traversal and ArrayList----------------
        ArrayList<Integer> path = new ArrayList<>();
        inOrderTraversalAndArrayList(root, path);
        if(path.size()<k){
            return -1;
        }
        return path.get(k-1);
    }
}