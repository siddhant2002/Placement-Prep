public class Solution {
    public static int sumOfAllDivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+factors(i);
        }
        return sum;
    }
    public static int factors(int n)
    {
        int sum=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0 && i!=n/i)
            {
                sum+=i;
                sum+=n/i;
            }
            else if(n%i==0 && i==n/i)
            {
                sum+=i;
            }
        }
        return sum;
    }
}