/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode ptr  = node;
        ListNode prev = null;

        while(ptr.next != null){
            prev = ptr;
            ptr.val = ptr.next.val;
            ptr = ptr.next;
        }
         prev.next = null;
    }
}