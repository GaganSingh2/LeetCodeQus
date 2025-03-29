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
    private ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }

        ListNode mid = midNode(head);
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=mid){
            prev = temp;
            temp = temp.next;
        }
        prev.next = prev.next.next;
        // System.out.println(prev.val);
        return head;
    }
}