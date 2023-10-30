package Stack and Queues;

public class Solution{
    static class Stack {
        int a[];
        int top=-1,len;
        Stack(int capacity) {
            len=capacity;
            a=new int[capacity];
        }
        public void push(int num) {
            if(top<len-1)
            {
                a[++top]=num;
            }
        }
        public int pop() {
            if(top==-1)
            {
                return -1;
            }
            else
            {
                return a[top--];
            }
        }
        public int top() {
            if(top!=-1)
            {
                return a[top];
            }
            else
            {
                return -1;
            }
        }
        public int isEmpty() {
            if(top==-1)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        public int isFull() {
            if(top==len-1)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
}