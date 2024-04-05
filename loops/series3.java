package loops;

import java.util.Scanner;

public class series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		n = sc.nextInt();
		
			for (i = 1; i <= n; i++) {
				sum = sum+i*(i+1);
				System.out.print(i+"*"+(int)(i+1));
				if (i < n)
					System.out.print("+");
			}
			System.out.println("=" + sum);
		}
}