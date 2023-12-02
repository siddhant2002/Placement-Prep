package LinkedList;

public class Solution
{
    public static Node insertAtFirst(Node list, int newValue) {
        Node fresh=new Node(newValue);
        fresh.next=list;
        list=fresh;
        return list;
    }
}