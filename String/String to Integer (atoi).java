package String;

class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
        {
            return 0;
        }
        long ans=0;
        int start_ind=0;
        if(s.charAt(0)=='-' || s.charAt(0)=='+')
        {
            start_ind=1;
        }
        for(int ind=start_ind;ind<s.length();ind++)
        {
            char c=s.charAt(ind);
            if(!(c>='0' && c<='9'))
            {
                break;
            }
            else
            {
                ans=Long.parseLong(s.substring(start_ind,ind+1));
                if(ans>Integer.MAX_VALUE)
                {
                    return start_ind == 0 ? Integer.MAX_VALUE : s.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
        }
        return start_ind == 1 ? s.charAt(0) == '-' ? -(int)ans : (int)ans : (int)ans;
    }
}