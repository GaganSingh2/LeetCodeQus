/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    //Helper Method to Store the node from rootNode to n in ArrayList
    private boolean getPath(TreeNode root, TreeNode n, ArrayList<TreeNode> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root == n){
            return true;
        }
        boolean isLeft = getPath(root.left, n, path);//stroe
        boolean isRight = getPath(root.right, n, path);

        if(isLeft || isRight){
            return true;
        }
        path.remove(path.size()-1);//means node n is not exist in leftSubTree and RightSubTree
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //1st Approach by using Recursion ----------------
        // if(root == null){
        //     return null;
        // }
        // if(root == p || root == q){
        //     return root;
        // }

        // TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);//check in left SubTree
        // TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);//check in right SubTree

        // if(leftLCA == null){ //rightLCA != null && leftLCA == null, so rightLCA
        //     return rightLCA;
        // }
        // if(rightLCA == null){ //rightLCA == null && leftLCA != null, so leftLCA
        //     return leftLCA;
        // }

        // return root; //leftLCA != null && rightLCA != null means root is result

        //2nd Approach by Using Path Based Approach----------------------
        if(root == null){
            return null;
        }
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        boolean foundLeft = getPath(root, p, path1);//store from root to p nodes
        boolean foundRight = getPath(root, q, path2);//store from root to q nodes

        if(!foundLeft || !foundRight){
            return null;//means givens n1 or n2 is not present in whole Binary Tree
        }
        int i = 0;
        while(i<path1.size() && i<path2.size()){
            if(path1.get(i) != path2.get(i)){
                break;
            }
            i++;
        }
        return path1.get(i-1);//means last comman node is LCA
    }
}