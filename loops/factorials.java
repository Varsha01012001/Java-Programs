package loops;

import java.util.Scanner;

public class factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i,sum=0,fact;             
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			fact =1;
			{
			for(float j=n;j>=1;j--) {
				fact = fact*j;
			}
			sum=sum+(i/fact);
			System.out.println((int)i+"/"+(int)i+"!");
			if(i<n)
				System.out.println("+");
			
		}
		System.out.println("="+sum);
		}
	}
}