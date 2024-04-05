package array;

import java.util.Scanner;

public class AssendingArr {

	public static void main(String[] args) {
		
		int[] a = { 20, 5, 12, 45, 2 };
		int i, j, t;
		

		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 0; i < a.length; i++) {
			System.out.println("Elements In Assending Order:" + a[i]);
		}
	}
}
