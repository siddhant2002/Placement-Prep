class Solution {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE)
        {
            return 0;
        }
        int rev=0;
        while(x!=0)
        {
            int val=x%10;
            int newval=
            rev=rev*10+(x%10);
            x/=10;
        }
        return rev;
    }
}