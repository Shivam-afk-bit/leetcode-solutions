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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode beforeLeft;
        ListNode afterRight;
        ListNode left1;
        ListNode right1;

        ListNode temp = head;
        int count = 1;

        // Keep original dummy
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode dummyNode = dummy;

        // Find beforeLeft and left1
        while (count != left) {
            dummyNode = dummyNode.next;
            temp = temp.next;
            count++;
        }

        beforeLeft = dummyNode;
        left1 = temp;

        // Find right1
        while (count != right) {
            temp = temp.next;
            count++;
        }

        right1 = temp;
        afterRight = temp.next;

        // Detach
        beforeLeft.next = null;
        right1.next = null;

        // Reverse detached list
        ListNode current = left1;
        ListNode prev = left1;
        ListNode next = left1.next;
        prev.next = null;
        while (next != null) {
            current = next;
            next = next.next;
            current.next = prev;
            prev =  current;
        }

        // Reconnect
        beforeLeft.next = prev;
        left1.next = afterRight;

        return dummy.next;
    }
}