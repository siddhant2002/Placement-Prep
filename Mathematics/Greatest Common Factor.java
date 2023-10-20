public class Solution {
    public static int calcGCD(int n, int m){
        while(n>0 && m>0)
        {
            if(m==0)
            {
                return n;
            }
            int dup=n;
            int dup1=m;
            n=m;
            m=dup%m;
        }
        return n;
    }
}