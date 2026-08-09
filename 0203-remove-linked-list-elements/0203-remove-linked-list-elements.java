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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }

        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            if(current.val == val && prev == null){
                current = current.next;
                head = current;
            }else if(current.val == val){
                prev.next = current.next;
                current = current.next;
            
            }else if(current.val == val && current.next == null){
                prev.next = null;
                break;
            }else{
                prev = current;
                current = current.next;
            }




        }
        return head;
    }
}