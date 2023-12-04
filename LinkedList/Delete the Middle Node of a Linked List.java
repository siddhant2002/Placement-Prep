package LinkedList;

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int count=0;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            count++;
        }
        if(count==1)
        {
            return null;
        }
        int n=count/2;
        int ind=1;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            if(ind==n)
            {
                ptr.next=ptr.next.next;
                return head;
            }
            ind++;
        }
        return head;
    }
    
}