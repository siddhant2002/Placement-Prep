package Placement-Prep.Mathematics;
public class Solution {
	public static boolean isPrime(int num) {
		if(num==1)
		{
			return false;
		}
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag ? "YES" : "NO";
	}
}