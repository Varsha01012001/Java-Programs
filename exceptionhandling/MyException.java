package exceptionhandling;

import java.util.Scanner;

public class MyException {
	static void checkAge(int age) {
		if(age>=15) {
			System.out.println("Person Age is Valid");
		}
		else {
			throw new ArithmeticException("Person Age is Not valid");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter Person Age: ");
		age=sc.nextInt();
		try {
			checkAge(age);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("rest of code...");
	}

}

