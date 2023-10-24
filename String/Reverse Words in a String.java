package String;

class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder ans=new StringBuilder();
        StringBuilder nm=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c==' ' && nm.length()>0)
            {
                ans.append(nm);
                ans.append(" ");
                nm.setLength(0);
            }
            else if(c!=' ')
            {
                nm.insert(0,c);
            }
        }
        ans.append(nm);
        return ans.toString();
    }
}