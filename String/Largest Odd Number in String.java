package String;

class Solution {
    public String largestOddNumber(String num) {
        int last=-1;
        for(int i=num.length()-1;i>=0;)
        {
            char c=num.charAt(i);
            if((c=='1' || c=='3' || c=='5' || c=='7' || c=='9') && last==-1)
            {
                last=i;
            }
            else
            {
                i--;
            }
            if(last!=-1)
            {
                break;
            }
        }
        return last==-1 ? "" : num.substring(0,last+1);
    }
}