package Bit Manipulation;

public class Solution {
    public static int[] bitManipulation(int num, int i){
        String val=Integer.toBinaryString(num);
	    int len1=val.length();
	    if(i>len1)
	    {
	        for(int ind=1;ind<=i-len1;ind++)
	        {
	            val="0"+val;
	        }
	    }
	    //System.out.println(val);
	    char c[]=val.toCharArray();
        int len=c.length;
        int ans[]=new int[3];
        ans[0]=c[len-i]-'0';
        c[len-i]='1';
        ans[1]=Integer.parseInt(String.valueOf(c),2);
        c[len-i]='0';
        ans[2]=Integer.parseInt(String.valueOf(c),2);
        return ans;
    }
}