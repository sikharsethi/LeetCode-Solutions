package Linkedlist;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}  
  
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;

        //Traverse both lists until we process all nodes carry 
        while(l1 != null || l2 != null || carry!= 0) {

            //Get values from current nodes (0 if node is null) 
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            //Calculate sum and new carry
            int sum = val1 + val2 + carry;
            carry = sum/10; //Carry for next iteration
            int digit = sum % 10; //Current digit to score

            //Create new node with the digit
            current.next = new ListNode(digit);
            current = current.next;

            //Move to next nodes if they exist
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return head.next;
    }
}
