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
        int length = 0;
        int count = 1;
        

        ListNode temp =  head;
        ListNode temp2 = head;

        while(temp != null){
            length++;
            temp =  temp.next;
            
        }

     temp = head;
       if(length == n){
        head=head.next;
        return head;
       }

        while(count < length -n){
            count++;
            temp=temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}