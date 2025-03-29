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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode temp = head;
         int size = 0;
         while(temp != null){
            temp = temp.next;
            size++;
         }
        if(size==n){
            return head.next;
        }
        int len = size - n;
        int cou = 1;
        ListNode del = head;
        while(cou<len){
            del = del.next;
            cou++;
        }
        del.next = del.next.next;
        // System.out.println(del.val);
         return head;

    }
}