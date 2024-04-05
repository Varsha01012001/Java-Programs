package array;

import java.util.Scanner;

public class demoArr {

	public static void main(String[] args) {
		//  Array
		int size, i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size:");
		size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter" + size + "array elements:");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Array:");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
