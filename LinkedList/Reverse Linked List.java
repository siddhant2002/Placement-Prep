package LinkedList;

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode ptr=head,ptr1=head,ptr2=head;
        for(ptr=null,ptr1=head,ptr2=head.next,ptr1.next=null;ptr2!=null;ptr2=ptr2.next,ptr1.next=ptr)
        {
            ptr=ptr1;
            ptr1=ptr2;
        }
        head=ptr1;
        return head;
    }
}