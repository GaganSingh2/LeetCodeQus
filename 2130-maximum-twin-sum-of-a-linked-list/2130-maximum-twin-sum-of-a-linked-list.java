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
class Solution {
    private ListNode foundMidNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode reverseList(ListNode midNode){
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode rightHead = prev;
        return rightHead;
    }
    public int pairSum(ListNode head) {
        if(head.next == null){
            return head.val;
        }
        ListNode midNode = foundMidNode(head);
        // System.out.println(midNode.val);
        ListNode revHead = reverseList(midNode);
        // System.out.println(revHead.val);

        ListNode si = head;
        ListNode ei = revHead;
        int maxSum = 0;
        while(si != null && ei != null){
            int currSum = si.val + ei.val;
            maxSum = Math.max(maxSum, currSum);
            si = si.next;
            ei = ei.next;
            
        }
        return maxSum;
    }
}