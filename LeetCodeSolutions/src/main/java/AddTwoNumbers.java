public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode sum = head;
        int carry = 0;
        
        while (l1 != null && l2 != null) {
            int val1 = l1.val;
            int val2 = l2.val;
            
            int total = val1 + val2 + carry;
            
            if (total > 9) {
                carry = 1;
                sum.next = new ListNode(total % 10);
            } else {
                carry = 0;
                sum.next = new ListNode(total);
            }
            
            l1 = l1.next;
            l2 = l2.next;
            sum = sum.next;
        }
        
        while (l1 != null) {
            int total = l1.val + carry;
            
            if (total > 9) {
                carry = 1;
                sum.next = new ListNode(total % 10);
            } else {
                carry = 0;
                sum.next = new ListNode(total);
            }
            
            l1 = l1.next;
            sum = sum.next;
        }
        
        while (l2 != null) {
            int total = l2.val + carry;
            
            if (total > 9) {
                carry = 1;
                sum.next = new ListNode(total % 10);
            } else {
                carry = 0;
                sum.next = new ListNode(total);
            }
            
            l2 = l2.next;
            sum = sum.next;
        }
        
        if (carry != 0) {
            sum.next = new ListNode(carry);
            sum = sum.next;
        }
        
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { 
        this.val = val; 
    }

    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
    }
}