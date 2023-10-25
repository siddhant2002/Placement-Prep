package String;

class Solution {
    public int maxDepth(String s) {
        int count=0,max_count=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                count++;
                max_count=Math.max(max_count,count);
            }
            else if(c==')')
            {
                count--;
            }
        }
        return max_count;
    }
}