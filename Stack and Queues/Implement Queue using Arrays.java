package Stack and Queues;

public class Solution {
    class Queue {
        int front, rear;
        int []arr;

        Queue() {
            front = -1;
            rear = -1;
            arr = new int[100001];
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            if(front==-1 && rear==-1)
            {
                arr[++front]=e;
                rear++;
            }
            else
            {
                if(rear<100001)
                {
                    arr[++rear]=e;
                }
            }
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            if(front!=-1 && front<=rear)
            {
                return arr[front++];
            }
            else
            {
                return -1;
            }
        }
    }
}