package basic;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args)
	{
		float p,r,t;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principle:");
		p=sc.nextFloat();
		
		System.out.print("Enter the Rate Interest:");
		r=sc.nextFloat();
		
		System.out.print("Enter the Time period:");
		t=sc.nextFloat();
		
		float si=(r*t*p)/100;
		
		System.out.print("the simple interest is :"+si);
		
		}

}
