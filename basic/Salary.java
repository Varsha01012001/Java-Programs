package basic;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		double salary,taxAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary:");
		salary=sc.nextDouble();
		taxAmount=sc.nextDouble();
		if (salary <25000) {
			System.out.println("Tax Amount on salary "+taxAmount);
		}
		else {
			taxAmount=0.15*salary;
			
			System.out.println("Tax Amount on salary"+taxAmount);
		}
	}

}
