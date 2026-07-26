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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head = null;
        ListNode tail = null;
        ListNode node;

        int carry = 0;

            while(temp1 != null && temp2 != null){
                int value = temp1.val + temp2.val + carry;

                if(value > 10){
                    if(head == null){
                        node = new ListNode((value)%10);
                        head = node;
                        tail = node;
                        carry = 1; 
                        temp1 = temp1.next;
                        temp2 = temp2.next;
                    }else{
                        node = new ListNode((value)%10);
                        tail.next = node;
                        tail = node;
                        carry = 1; 
                        temp1 = temp1.next;
                        temp2 = temp2.next;
                    }

                        
                     
                    
                }else if(value == 10){

                    if(head == null){
                        node = new ListNode(0);
                        head = node;
                        tail = node;
                        carry = 1; 
                        temp1 = temp1.next;
                        temp2 = temp2.next;
                    }else{
                        node = new ListNode(0);
                        tail.next = node;
                        tail = node;
                        carry = 1; 
                        temp1 = temp1.next;
                        temp2 = temp2.next;
                    }



                }else{
                    if(head == null){
                        node = new ListNode(value);
                        head = node;
                        tail = node;
                        carry = 0; 
                        temp1 = temp1.next;
                        temp2 = temp2.next;
                    }else{
                        node = new ListNode(value);
                        tail.next = node;
                        tail = node;
                        carry = 0; 
                        temp1 = temp1.next;
                        temp2 = temp2.next;
                    }

                }

                   
            }

           if (temp2 == null) {
    while (temp1 != null) {
        int value = temp1.val + carry;

        if (value > 10) {
            node = new ListNode(value % 10);
            carry = 1;
            tail.next = node;
            tail = node;
            temp1 = temp1.next;
        } else if (value == 10) {
            node = new ListNode(0);
            carry = 1;
            tail.next = node;
            tail = node;
            temp1 = temp1.next;
        } else {
            node = new ListNode(value);
            carry = 0;  
            tail.next = node;
            tail = node;
            temp1 = temp1.next;
        }
    }
}

if (temp1 == null) {
    while (temp2 != null) {
        int value = temp2.val + carry;

        if (value > 10) {
            node = new ListNode(value % 10);
            carry = 1;
            tail.next = node;
            tail = node;
            temp2 = temp2.next;
        } else if (value == 10) {
            node = new ListNode(0);
            carry = 1;
            tail.next = node;
            tail = node;
            temp2 = temp2.next;
        } else {
            node = new ListNode(value);
            carry = 0;   
            tail.next = node;
            tail = node;
            temp2 = temp2.next;
        }
    }
}

if (carry == 1) {
    node = new ListNode(1);
    tail.next = node;
    tail = node;
}

return head;
        }
}