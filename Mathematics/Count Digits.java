package Placement-Prep.Mathematics;
public class Solution {
    public static int countDigits(int n){
        int count=0,dup=n;
        while(n!=0)
        {
            int d=(n%10);
            n/=10;
            if(d==0)
            {
                continue;
            }
            if(dup%d==0)
            {
                count++;
            }
        }
        return count;
    }
}