package array;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		
		int rowsize, columnsize, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rowsize and columnsize:");
		rowsize = sc.nextInt();
		columnsize = sc.nextInt();

		int a[][] = new int[rowsize][columnsize];
		System.out.println("Enter Array Elements:");
		
		for (i = 0; i < rowsize; i++) 
		{
			for (j = 0; j < columnsize; j++) 
			{
				a[i][j] = sc.nextInt();

				int b[][] = new int[rowsize][columnsize];
				System.out.println("Enter Array Elements:");
				for (i = 0; i < rowsize; i++)
				{
					for (j = 0; j < columnsize; j++) 
					{
						b[i][j] = sc.nextInt();

					}
				}
				System.out.println("Array : ");
				for (i = 0; i < rowsize; i++) {
					for (j = 0; j < columnsize; j++) {
						System.out.print(a[i][j] + b[i][j] + "");

					}

				}
				
			}
			System.out.println();
		}
	}
}
