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
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode newHead = null;
        ListNode tail = null;
        ListNode temp = head;
        while(temp != null){

            ListNode node = new ListNode(temp.val);
            if(newHead == null){
                newHead = node;
                tail = node;
            }else{
                
                node.next = newHead;
                newHead = node;
            }
            temp = temp.next;
        }

        temp = head;
        ListNode temp2 = newHead;
        while(temp != null){
            if(temp.val == temp2.val){
                temp=temp.next;
                temp2 = temp2.next;
            }else{
                break;
            }
        }

        if(temp != null){
            return false;
        }
        
       return true;

    }
}