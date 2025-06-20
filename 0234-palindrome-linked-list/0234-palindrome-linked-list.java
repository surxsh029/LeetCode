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
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        // step one mid
        ListNode mid=middle(head);
        // step2 reverse the mid half
        if(head==null || head.next==null) return true;
        ListNode current=mid;
        ListNode prev=null;
        ListNode next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        ListNode right=prev;
        ListNode left=head;
        // compare
        while(right!=null){
            if(right.val!=left.val) return false;

            right=right.next;
            left=left.next;
        }
        return true;
    }
}