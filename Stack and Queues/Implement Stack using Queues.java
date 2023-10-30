package Stack and Queues;

class MyStack {
    Queue<Integer> nm=new LinkedList<>();
    public MyStack() {
    }
    
    public void push(int x) {
        nm.offer(x);
    }
    
    public int pop() {
        Queue<Integer> kk=new LinkedList<>();
        while(nm.size()>1)
        {
            kk.offer(nm.poll());
        }
        int val=nm.poll();
        while(!kk.isEmpty())
        {
            nm.offer(kk.poll());
        }
        return val;
    }
    
    public int top() {
        Queue<Integer> kk=new LinkedList<>();
        while(nm.size()>1)
        {
            kk.offer(nm.poll());
        }
        int val=nm.poll();
        kk.offer(val);
        while(!kk.isEmpty())
        {
            nm.offer(kk.poll());
        }
        return val;
    }
    
    public boolean empty() {
        return nm.isEmpty();
    }
}