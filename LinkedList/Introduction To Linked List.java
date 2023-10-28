package LinkedList;

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node constructLL(int []arr) {
        Node start=null,prev=null;
        for(int i=0;i<arr.length;i++)
        {
            Node fresh=new Node(arr[i]);
            if(start==null)
            {
                start=fresh;
            }
            else
            {
                prev.next=fresh;
            }
            prev=fresh;
        }
        return start;
    }
}