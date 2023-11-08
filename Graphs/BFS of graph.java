package Graphs;

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> nm=new ArrayList<>();
        Queue<Integer> kk=new LinkedList<>();
        boolean k[]=new boolean[V];
        kk.add(0);
        k[0]=true;
        while(!kk.isEmpty())
        {
            int size=kk.size();
            for(int i=1;i<=size;i++)
            {
                int val=kk.poll();
                for(int ind:adj.get(val))
                {
                    if(!k[ind])
                    {
                        kk.offer(ind);
                        k[ind]=true;
                    }
                }
                nm.add(val);
            }
        }
        return nm;
    }
}