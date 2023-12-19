package Array;

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int ind=0;
        long sum=0;
        int ans=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+(long)(a[i]);
            while(sum>k)
            {
                sum-=(long)(a[ind]);
                ind++;
            }
            if(sum==k)
            {
                ans=Math.max(ans,i-ind+1);
            }
        }
        return ans;
    }
}
