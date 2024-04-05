package loops;

import java.util.Scanner;

public class series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i,j,sum=0,fact;             
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n:");
		j=sc.nextInt();
		
		for(i=1;i<=5;i++) {
			System.out.println((int)i+"/"+(int)i+"!");
			fact=1;
			for(j=1;j<=i;j++) {
				fact=fact*j;
				}
			sum=sum+(i/fact);
			if(i<5)
				System.out.print("+");
		}
		System.out.println("="+sum);
		
	}

}
