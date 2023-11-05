package Dynamic Programming;

class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid[0][0]==1)
        {
            return 0;
        }
        int size=grid.length;
        int size1=grid[0].length;
        int dp[][] = new int[size][size1];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size1;j++)
            {
                if(grid[i][j]==1)
                {
                    dp[i][j]=0;
                }
                else if(i==0 && j==0)
                {
                    dp[i][j]=1;
                }
                else
                {
                    int up=0,down=0;
                    if(i>0)
                    {
                        up=dp[i-1][j];
                    }
                    if(j>0)
                    {
                        down=dp[i][j-1];
                    }
                    dp[i][j]=up+down;
                }
            }
        }
        return dp[size-1][size1-1];
    }
}