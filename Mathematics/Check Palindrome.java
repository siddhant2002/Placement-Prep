package Placement-Prep.Mathematics;
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,dup,d;
        if(x>=0)
        {
            dup=x;
            while(dup!=0)
            {
                d=dup%10;
                rev=rev*10+d;
                dup/=10;
            }
            if(x==rev)
                return true;
            else 
                return false;
        }
        else 
            return false;
    }
}