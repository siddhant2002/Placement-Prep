package Graphs;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> nm=new ArrayList<>();
        boolean k[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!k[i])
            {
                task(adj,nm,k,i);
            }
        }
        return nm;
    }
    
    public void task(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> nm, boolean k[], int ind)
    {
        k[ind]=true;
        nm.add(ind);
        for(int i:adj.get(ind))
        {
            if(!k[i])
            {
                task(adj,nm,k,i);
            }
        }
    }
}