public class Algorithm_Day5_MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        int x = 0;
        for(ListNode i=head;i!=null;i = i.next) {
            x++;
        }
        System.out.println(x);
        if(x%2==0) {
            x = (int) Math.ceil((double)(1+(x-1)/2));
        }
        else {
            x = 1+(x-1)/2;
        }
        ListNode n=head;
        int j=0;
        for(ListNode i=head;j<x;i = i.next,j++) {
            n = i;
            j++;
        }
        return n;
    }
    class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
