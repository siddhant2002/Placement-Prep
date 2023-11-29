package LinkedList;

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
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            count++;
        }
        if(n==count)
        {
            head=head.next;
            return head;
        }
        int ind=1;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            if(ind==count-n)
            {
                ptr.next=ptr.next.next;
                return head;
            }
            ind++;
        }
        return head;
    }
}