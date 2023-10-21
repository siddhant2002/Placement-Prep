public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        int a[]=new int[n];
        for(int i:nums)
        {
            if(i<=n)
            {
                a[i-1]++;
            }
        }
        return a;
    }
}