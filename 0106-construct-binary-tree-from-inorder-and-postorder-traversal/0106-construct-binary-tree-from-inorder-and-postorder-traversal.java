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
    public int index;
    public  HashMap<Integer, Integer> map;
    private TreeNode helper(int postorder[], int si, int ei){
        if(si>ei){
            return null;
        }

        int val = postorder[index--];
        TreeNode root = new TreeNode(val);

        int postOrderIndex = map.get(val);
        root.right = helper(postorder, postOrderIndex+1, ei);
        root.left = helper(postorder, si, postOrderIndex-1);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        index = postorder.length-1;
        return helper(postorder, 0, inorder.length-1);
    }
}