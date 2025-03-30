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
    private static ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode merge(ListNode half1,ListNode half2){
        ListNode mergeLL = new ListNode(-1);
        ListNode temp = mergeLL;
        while(half1 != null && half2 != null){
            if(half1.val <= half2.val){
                temp.next = half1;
                half1 = half1.next;
            }
            else{
                temp.next = half2;
                half2 = half2.next;
            }
            temp = temp.next;
        }
        while(half1 != null){
            temp.next = half1;
            temp = temp.next;
            half1 = half1.next;
        }
        while(half2 != null){
            temp.next = half2;
            temp = temp.next;
            half2 = half2.next;
        }
        
        return mergeLL.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        // Mid Node
        ListNode midNode = findMid(head);
        ListNode rightHead = midNode.next;
        midNode.next = null;

        ListNode leftHalf = sortList(head);
        ListNode rightHalf = sortList(rightHead);

        return merge(leftHalf,rightHalf);
    }
}















