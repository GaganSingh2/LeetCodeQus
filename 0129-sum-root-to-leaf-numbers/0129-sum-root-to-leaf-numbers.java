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
    int totalSum = 0;
    public int foundSum(ArrayList<Integer> path){
        int sum = 0;
        for(int val: path){
            sum = sum * 10 + val;
        }
        return sum;
    }
    public void helperMethod(TreeNode root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.val);
        if(root.left == null && root.right == null){
            totalSum += foundSum(path);
            // System.out.println(totalSum);
        }
        else{
            helperMethod(root.left, path);
            helperMethod(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return -1;
        }
       
        ArrayList<Integer> path = new ArrayList<>();
        helperMethod(root, path);

        return totalSum;
    }
}



















