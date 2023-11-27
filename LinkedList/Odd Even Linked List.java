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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
        {
            return head;
        }
        ListNode ptr1=head,ptr2=head.next,ptr3=head.next.next,poin=ptr2;
        ptr1.next=ptr2.next=null;
        int c=1;
        while(ptr3!=null)
        {
            if(c%2==1)
            {
                ptr1.next=ptr3;
                ptr3=ptr3.next;
                ptr1.next.next=null;
                ptr1=ptr1.next;
                c--;
            }
            else
            {
                ptr2.next=ptr3;
                ptr3=ptr3.next;
                ptr2.next.next=null;
                ptr2=ptr2.next;
                c++;
            }
        }
        ptr1.next=poin;
        return head;
    }
}