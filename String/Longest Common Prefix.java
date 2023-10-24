package String;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String second=strs[strs.length-1];
        int ind=0;
        while(ind<first.length() && ind<second.length())
        {
            if(first.charAt(ind) == second.charAt(ind))
            {
                ind++;
            }
            else
            {
                break;
            }
        }
        return first.substring(0,ind);
    }
}