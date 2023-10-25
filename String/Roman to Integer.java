package String;

class Solution {
    public int romanToInt(String s) {
        int len=s.length();
        int a[]=new int[len];
        int ind=0;
        for(char c:s.toCharArray())
        {
            if(c=='I')
            {
                a[ind++]=1;
            }
            else if(c=='V')
            {
                a[ind++]=5;
            }
            else if(c=='X')
            {
                a[ind++]=10;
            }
            else if(c=='L')
            {
                a[ind++]=50;
            }
            else if(c=='C')
            {
                a[ind++]=100;
            }
            else if(c=='D')
            {
                a[ind++]=500;
            }
            else if(c=='M')
            {
                a[ind++]=1000;
            }
        }
        int ans=0;
        for(int i=0;i<len-1;i++)
        {
            if(a[i]<a[i+1])
            {
                ans-=a[i];
            }
            else
            {
                ans+=a[i];
            }
        }
        return ans+a[len-1];
    }
}