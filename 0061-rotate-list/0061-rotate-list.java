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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        int size = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        k %= size;
        if(k==0) return head; //for no repeate

        temp.next = head;
        int newstp = size-k;
        ListNode newtemp = head;
        for(int i=1; i<newstp; i++){
            newtemp = newtemp.next;
        }
        head = newtemp.next;
        newtemp.next = null;

        return head;
    }
}