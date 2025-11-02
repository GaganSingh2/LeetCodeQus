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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> val = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            val.add(nums[i]);
        }
        ListNode temp = head;
        ListNode newNode = new ListNode(0);
        ListNode tmp = newNode;
        while(temp != null ){
            if(val.contains(temp.val)){
                
                if(temp.next==null){
                    tmp.next = null;
                    break;
                }
                temp = temp.next;
            }
            else{
                tmp.next = temp;
                tmp = tmp.next;
                temp = temp.next;
            }
        }
        return newNode.next;
    }
}