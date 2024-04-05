package basic;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		    
		if(a>b && a>c){
			System.out.println("is max"+a);
		}
			else if(b>c && b>a) {
			System.out.println("is max"+b);
	}
	else {
		System.out.println("is max"+c);	
		}
     }
}

