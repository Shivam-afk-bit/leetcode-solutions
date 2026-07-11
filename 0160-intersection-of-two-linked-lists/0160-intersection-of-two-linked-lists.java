/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        ListNode temp;
        int length1 = 1;
        int length2 = 1;


        while(temp1.next != null){
            length1++;
            temp1 =  temp1.next;
        }

        while(temp2.next != null){
            length2++;
            temp2 = temp2.next;
        }


        int difference = Math.abs(length1 - length2); 
      
        
        if(length1 > length2){
                temp1 = headA;
                temp2 = headB;
                while(difference != 0){
                    temp1 = temp1.next;
                    difference--;
                 }
                }else if(length1 < length2){
                    temp2 = headB;
                    temp1 =  headA;
                    while(difference !=0){
                        temp2 =  temp2.next;
                        difference--;
                    }
                }else {
                    temp1 = headA;
                    temp2 = headB;
                }


                while(temp1 != null){
                    if(temp1 == temp2){
                        return temp1;
                    }
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
                return null;
    
        }

       
}
