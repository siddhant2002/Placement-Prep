import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dup=n;
		int sum=0;
		int pow=String.valueOf(n).length();
		while(n!=0)
		{
			int dig=n%10;
			sum=sum+(int)(Math.pow(dig,pow));
			n/=10;
		}
		System.out.println(sum==dup);
	}
}
