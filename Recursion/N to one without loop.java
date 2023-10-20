package Placement-Prep.Recursion;

public class Solution {
    public static int[] printNos(int x) {
        int a[]=new int[x];
        task(x,a);
        return a;
    }
    public static void task(int n, int a[])
    {
        if(n==0)
        {
            return;
        }
        task(n-1,a);
        a[n-1]=n;
    }
}