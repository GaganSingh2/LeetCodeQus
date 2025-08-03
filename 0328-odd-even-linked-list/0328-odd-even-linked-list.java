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
        
        ListNode evenNode = new ListNode(-1);
        ListNode oddNode = new ListNode(-1);
        int len = 1;
        ListNode temp = head, odd = oddNode, even = evenNode;
        while(temp != null){
            if(len % 2 != 0){
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
        odd.next = (evenNode.next != null)?evenNode.next:null;
        even.next = null;
        return oddNode.next;

    }
}