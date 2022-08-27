package impquesanswer;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		int rev=a;
		while(a>0)
		{
			sum=sum*10+a%10;
			a=a/10;
		}
		{if(rev==sum)
		{
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Normal Number");
		}
	}}
}
