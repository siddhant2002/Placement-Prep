package Placement-Prep.Recursion;

class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        List<Character> nm=new ArrayList<>();
        for(char c:s.toCharArray())
        {
            if((c>='a' && c<='z') || (c>='0' && c<='9'))
            {
                nm.add(c);
            }
        }
        if(nm.size()==0)
        {
            return true;
        }
        boolean flag[]=new boolean[1];
        task(nm,0,nm.size()-1,flag);
        return flag[0];
    }
    public void task(List<Character> nm, int i, int j, boolean flag[])
    {
        if(i<=j)
        {
            char c=nm.get(i);
            char d=nm.get(j);
            if(c==d)
            {
                flag[0]=true;
            }
            else
            {
                flag[0]=false;
                return;
            }
            task(nm,i+1,j-1,flag);
        }
    } 
}