package basic;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		    if(num==0) {
			System.out.println("the number is zero");
		    }
			else if(num>0){
			System.out.println("the number is Positive");
				}
		   else {
			System.out.println("the number is Negative");
		}
   }
}

