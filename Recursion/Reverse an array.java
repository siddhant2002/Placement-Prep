package Placement-Prep.Recursion;

public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=nums[i];
        }
        task(a,0,n-1);
        return a;
    }
    public static void task(int a[], int i, int j)
    {
        if(i<=j)
        {
            int dup=a[i];
            a[i]=a[j];
            a[j]=dup;
            task(a,i+1,j-1);
        }
        return;
    }
}