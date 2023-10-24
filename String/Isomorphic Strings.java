package String;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Character> nm=new HashMap<>();
        Map<Character,Character> kk=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(nm.containsKey(c))
            {
                if(nm.get(c)!=d)
                {
                    return false;
                }
            }
            else
            {
                nm.put(c,d);
            }
            if(kk.containsKey(d))
            {
                if(kk.get(d)!=c)
                {
                    return false;
                }
            }
            else
            {
                kk.put(d,c);
            }
        }
        return true;
    }
}