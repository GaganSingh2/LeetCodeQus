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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode newNode = new ListNode(-1);
        ListNode temp = newNode;
        while(head1 != null && head2 != null){
            int data = head1.val+head2.val+carry;
             if(carry==1) carry--;
            ListNode da = new ListNode(data);
            if(data>9){
                data = data % 10;
                ListNode zero = new ListNode(data);
                temp.next = zero;
                carry = 1;
            }
            else{
                temp.next = da;
            }
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        while(head1 != null){
            int data1 = head1.val+carry;
            if(carry==1) carry--;
            ListNode da = new ListNode(data1);
            if(data1>9){
                data1 = data1 % 10;
                ListNode da1 = new ListNode(data1);
                carry = 1;
                temp.next = da1;
            }else{
                temp.next = da;
            }
            head1 = head1.next;
            temp = temp.next;
        }
         while(head2 != null){
            int data1 = head2.val+carry;
            if(carry==1) carry--;
            ListNode da = new ListNode(data1);
            if(data1>9){
                data1 = data1 % 10;
                ListNode da1 = new ListNode(data1);
                carry = 1;
                temp.next = da1;
            }else{
                temp.next = da;
            }
            head2 = head2.next;
            temp = temp.next;
        }
        if(carry == 1){
            ListNode car = new ListNode(1);
            temp.next = car;
        }
        return newNode.next;
    }
}