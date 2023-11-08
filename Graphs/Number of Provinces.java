package Graphs;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean k[]=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++)
        {
            if(!k[i])
            {
                task(isConnected,k,i);
                count++;
            }
        }
        return count;
    }
    public void task(int isConnected[][], boolean k[], int ind)
    {
        k[ind]=true;
        for(int i=0;i<isConnected.length;i++)
        {
            if(isConnected[ind][i]==1 && !k[i])
            {
                task(isConnected,k,i);
            }
        }
    }
}