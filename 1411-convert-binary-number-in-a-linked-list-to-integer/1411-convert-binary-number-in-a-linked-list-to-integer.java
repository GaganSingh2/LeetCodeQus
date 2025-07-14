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
    public int getDecimalValue(ListNode head) {
        // 1st Way-----
        int binNum = 0;
        while(head != null){
            binNum = (binNum << 1) | head.val;
            head = head.next;
        }

        return binNum;
        //2nd Way----
        /*
        if(head==null || head.next==null){
            return head.val;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        size -= 1;
        temp = head;
         double tempVal = 0.0;
        int binNum = 0;
        while(temp != null){
            if(temp.val == 1){
                tempVal = Math.pow(2,size--);
                binNum += (int)tempVal;
                tempVal = 0.0;
            }
            else{
                size--;
            }
            temp = temp.next;
        }
        return binNum;
        */
    }
}