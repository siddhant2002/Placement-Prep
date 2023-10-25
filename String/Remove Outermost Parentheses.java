package String;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder nm=new StringBuilder();
        int count=0;
        int start_ind=-1,end_ind=-1;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                if(count==0)
                {
                    start_ind=i+1;
                }
                count++;
            }
            else
            {
                if(count==1)
                {
                    end_ind=i;
                }
                count--;
            }
            if(count==0)
            {
                if(start_ind<=end_ind)
                {
                    nm.append(s.substring(start_ind,end_ind));
                }
            }
        }
        return nm.toString();
    }
}