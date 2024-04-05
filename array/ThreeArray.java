package array;

import java.util.Scanner;

public class ThreeArray {

	public static void main(String[] args) {
		int rowsize, columnsize, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rowsize and columnsize:");
		rowsize = sc.nextInt();
		columnsize = sc.nextInt();

		int b[][] = new int[rowsize][columnsize];
		System.out.println("Enter Array Elements:");
		for (i = 0; i < rowsize; i++) {
			for (j = 0; j < columnsize; j++) {
				b[i][j] = sc.nextInt();

			}
		}
		System.out.println("Array : ");
		for (i = 0; i < rowsize; i++) {
			for (j = 0; j < columnsize; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();

		}
	}
}
