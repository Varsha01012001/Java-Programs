package basic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
    }

}

