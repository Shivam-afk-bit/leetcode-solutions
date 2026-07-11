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
    public void reorderList(ListNode head) {

        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current;
        ListNode next;
        ListNode prev;

        if(fast != null){
            current = slow.next;
        }else{

            current = slow;
        }

        next = current.next;
        prev = current;
        prev.next = null;

        while(next != null){
            current = next;
            next = next.next;
            current.next = prev;
            prev  = current;
        }

        ListNode hf = head;
        ListNode hs = current;
        while(hf!= null && hs != null){
          ListNode  temp = hf.next;
          hf.next =  hs;
          hf = temp;
          temp = hs.next;
          hs.next = hf;
          hs = temp;

        }

        if(hf != null){
            hf.next = null;
        }

    }
}