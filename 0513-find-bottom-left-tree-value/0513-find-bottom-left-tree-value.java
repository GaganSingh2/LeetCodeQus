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
    int ans = 0;
    int l = 0;
    //Helper method find bottom level value using Recursion (Preorder Traversal)
    private void findBottomLeftValUsingRecursion(TreeNode root, int level){
        if(root == null) return;

        findBottomLeftValUsingRecursion(root.left, level + 1);
        if(root.left == null && root.right == null && level>l){
            ans = root.val;
            l = level;
        }

        findBottomLeftValUsingRecursion(root.right, level + 1);
    }
    public int findBottomLeftValue(TreeNode root) {
        //1st Approach using Recursion (PreOrder Traversal)--------------------
        ans = root.val;
        findBottomLeftValUsingRecursion(root, 0);
        return ans;

        
        //2nd Approach By Using Level Order Traversal---------------------
        // if(root == null){
        //     return -1;
        // }

        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        // q.add(null);
        // int leftVal = root.val;
        // int cnt = 1;
        // while(!q.isEmpty()){
        //     TreeNode currNode = q.remove();
        //     if(currNode == null){
        //         if(q.isEmpty()){
        //             return leftVal;
        //         }
        //         else{
        //             q.add(null);
        //             cnt++;
        //         }
        //     }
        //     else{
        //         if(cnt == 1){
        //             leftVal = currNode.val;
        //             cnt = 0;
        //         }
        //         if(currNode.left != null){
        //             q.add(currNode.left);
        //         }
        //         if(currNode.right != null){
        //             q.add(currNode.right);
        //         }
        //     }
        // }
        // return leftVal;
    }
}










