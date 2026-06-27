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
    public int index = 0;
    private TreeNode helper(int preorder[], int si, int ei, HashMap<Integer,Integer> map){
        if(si>ei){
            return null;
        }
        
        int val = preorder[index++];

        TreeNode root = new TreeNode(val);
        int inorderIndex = map.get(val);

        root.left = helper(preorder, si, inorderIndex-1, map);
        root.right = helper(preorder, inorderIndex+1, ei, map);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length-1, map);
    }
}












































