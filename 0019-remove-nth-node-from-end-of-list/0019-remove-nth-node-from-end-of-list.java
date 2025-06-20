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
        int count=0;
        ListNode current=head;

        while(current!=null){
            count++;
            current=current.next;
        }

       if(count==n){
         return head.next;
       }
        int index=count-n;
        ListNode prev=head;
        for(int i=1;i<index;i++){
          prev=prev.next;
        }
        prev.next=prev.next.next;

        return head;
        
    }
}