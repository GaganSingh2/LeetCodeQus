/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    private ListNode foundMid(ListNode si, ListNode ei){
        ListNode slow = si;
        ListNode fast = si;
        while(fast != ei && fast.next != ei){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private TreeNode buildBST(ListNode si, ListNode ei){
        if(si == ei){
            return null;
        }
        ListNode mid = foundMid(si, ei);
        
        // System.out.println(temp.val+" "+mid.val);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildBST(si, mid);
        root.right = buildBST(mid.next, ei);

        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);
        ListNode si = head;
        ListNode ei = null;
        return buildBST(si, ei);
    }
}