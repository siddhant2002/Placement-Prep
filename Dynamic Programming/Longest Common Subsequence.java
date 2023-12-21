package Dynamic Programming;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length(),n=text2.length();
        int prev[]=new int[n+1];
        for(int i=1;i<=m;i++)
        {
            int cur[]=new int[n+1];
            for(int j=1;j<=n;j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    cur[j] = 1+prev[j-1];
                }
                else
                {
                    cur[j] = Math.max(prev[j] , cur[j-1]);
                }
            }
            for(int j=0;j<=n;j++)
            {
                prev[j]=cur[j];
            }
        }
        return prev[n];
    }
}
