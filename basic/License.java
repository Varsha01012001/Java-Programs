package basic;

import java.util.Scanner;

public class License {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		age=sc.nextInt();
		if(age>18) {
			System.out.println("he is eligible for licence");
			
		}
		else {
			System.out.println("he is not eligible");
		}

	}

}

