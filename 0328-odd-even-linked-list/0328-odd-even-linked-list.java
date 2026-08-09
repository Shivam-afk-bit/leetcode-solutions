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
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode headOdd = head;
        ListNode headEven = head.next;
        ListNode evenTemp = head.next;
        ListNode oddTemp = head;

        while(evenTemp.next != null || oddTemp.next != null){
            oddTemp.next = evenTemp.next;
            if(oddTemp.next != null){
                oddTemp = oddTemp.next;
            }
        
            evenTemp.next = oddTemp.next;

            if(evenTemp.next != null){
                evenTemp = evenTemp.next;
            }
        }

       
            oddTemp.next = headEven;
            return headOdd;
       

    

    }
}