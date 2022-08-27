package impquesanswer;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int sum=0;
		while(number>0)
		{
			
			sum=sum*10+number%10;
			number=number/10;
			
		}
		System.out.println("Reverse Number is"+sum);
}

}
