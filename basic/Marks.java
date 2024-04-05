package basic;

import java.io.StringWriter;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		double phy , chem,Bio;
		double percentage,total;
		String Grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of Phy , chem, and Bio:\n");
		
		phy=sc.nextDouble();
		chem=sc.nextDouble();
		Bio=sc.nextDouble();
		
		total = phy+chem+Bio;
		
		System.out.println("total marks phy,chem,bio\n"+total);
		
		percentage =total/3;
		System.out.println("percentage is :"+percentage);
		
		if(percentage>=80) {
			System.out.println("Grade is A+");
		}
		else if(percentage>=70) {
			System.out.println("Grade is A");
			}
		else if(percentage>=60) {
			System.out.println("Grade is B+");
		}
		else if (percentage>=50) {
			System.out.println("Grade is B");
		}
		else {
			System.out.println("you are Fail");
		}

	}

}
