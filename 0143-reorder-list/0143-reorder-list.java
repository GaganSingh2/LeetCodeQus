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
    private ListNode revHalfList(ListNode midNode){
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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode midNode = foundMidNode(head);
        // System.out.println(midNode.val);
        ListNode rightHead = revHalfList(midNode);
        // System.out.println(rightHead.val);
        ListNode newNode = new ListNode();
        ListNode leftHead = head;
        int cnt = 0;
        while(leftHead != null && rightHead != null){
            if(cnt % 2==0){
                newNode.next = leftHead;
                leftHead = leftHead.next;
            }
            else{
                newNode.next = rightHead;
                rightHead = rightHead.next;
            }
            cnt++;
            newNode = newNode.next;
        }
    }
}