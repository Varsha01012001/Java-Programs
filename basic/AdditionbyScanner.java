package basic;

import java.util.Scanner;

public class AdditionbyScanner {

	public static void main(String[] args) 
	
	{
		 int a,b,c;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter 2 numbers:");
     a=sc.nextInt();
     b=sc.nextInt();
     
     c=a+b;
     
     System.out.println("Addition : "+c);
	}

}



