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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(-1);
        ListNode evenHead = new ListNode(-1);
        
        ListNode temp = head, odd = oddHead, even = evenHead;
        int len = 1;
        while(temp != null){
            if(len%2 != 0){
                odd.next = temp;
                odd = odd.next;
            }
            else{
                even.next = temp;
                even = even.next;
            }
            len++;
            temp = temp.next;
        }
        
        odd.next = (evenHead.next != null)? evenHead.next : null;
        even.next = null;
        return oddHead.next;

    }
}