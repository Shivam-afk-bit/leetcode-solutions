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
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        int count = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        int groups = count / k;

        ListNode prevHead = null;
        ListNode currHead = head;
        ListNode ans = null;

        for(int i = 0; i < groups; i++){
            ListNode prev = null;
            ListNode current = currHead;
            ListNode next = null;

            for(int j = 0; j < k; j++){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            if(prevHead == null){
                ans = prev;
            }else{
                prevHead.next = prev;
            }
            prevHead = currHead;
            currHead = current;
        }
        
        prevHead.next = currHead;
        return ans;
    }
}
