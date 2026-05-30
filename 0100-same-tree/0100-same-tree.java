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
    private boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q1.add(null);
        q2.add(q);
        q2.add(null);

        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode currNode1 = q1.remove();
            TreeNode currNode2 = q2.remove();
            if((currNode1 == null && currNode2 != null) || (currNode1 != null && currNode2 == null)){
                return false;
            }
            if(currNode1 == null && currNode2 == null){
                if(q1.isEmpty() && q2.isEmpty()){
                    return true;
                }
                else{
                    q1.add(null);
                    q2.add(null);
                }
            }
            else{
                if(currNode1.val != currNode2.val){
                    return false;
                }
                if((currNode1.left == null && currNode2.left != null) ||
                 (currNode1.left != null && currNode2.left == null)){
                    return false;
                }
                if(currNode1.left != null){
                    q1.add(currNode1.left);
                    q2.add(currNode2.left);
                }
                if((currNode1.right == null && currNode2.right != null) ||
                 (currNode1.right != null && currNode2.right == null)){
                    return false;
                }
                if(currNode1.right != null){
                    q1.add(currNode1.right);
                    q2.add(currNode2.right);
                }
                
            }
        }
        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //1st Approach using Recursion------------
        // if(p == null && q == null){
        //     return true;
        // }
        // if(p == null || q == null){
        //     return false;
        // }
        // if(p.val != q.val){
        //     return false;
        // }
        // boolean isLeft = isSameTree(p.left, q.left);
        // boolean isRight = isSameTree(p.right, q.right);
        
        // return isLeft && isRight;

        //2nd Approach using Level Order Traversal-----------
        return isSame(p,q);
    }
}