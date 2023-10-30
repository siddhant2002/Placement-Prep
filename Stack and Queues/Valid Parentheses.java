package Stack and Queues;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> nm=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            //System.out.println(c);
            if(c=='{' || c=='[' || c=='(')
            {
                nm.push(c);
            }
            else if(nm.isEmpty())
            {
                return false;
            }
            else
            {
                if(c=='}' && (nm.peek()=='[' || nm.peek()=='('))
                {
                    return false;
                }
                else if(c==']' && (nm.peek()=='{' || nm.peek()=='('))
                {
                    return false;
                }
                else if(c==')' && (nm.peek()=='[' || nm.peek()=='{'))
                {
                    return false;
                }
                else
                {
                    nm.pop();
                }
            }
        }
        return nm.isEmpty();
    }
}