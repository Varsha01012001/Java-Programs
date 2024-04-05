package ClaaandObject;

import java.util.Scanner;

public class Empoyee {
	String empname;
	int empCode;
	double basicSalary, allowance, grossSalary, tax, netSalary;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter emp code:");
		empCode = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter emp Name:");
		empname = sc.nextLine();
		System.out.print("Enter basic salary:");
		int empsalary = sc.nextInt();
	}

	public void allowance() {
		allowance = basicSalary * 0.55;
	}

	public void gross() {
		grossSalary = basicSalary * allowance;
	}

	public void tax() {
		tax = grossSalary * 0.12;
	}

	public void net() {
		netSalary = grossSalary - tax;
	}

	public void display() {
		System.out.print("emp code:" + empCode);
		System.out.print("enter name:" + empname);
		System.out.print("Basic Salary:" + basicSalary);
		System.out.print("allowance:" + allowance);
		System.out.print("grossSalary:" + grossSalary);
		System.out.print("tax:" + tax);
		System.out.print("net salary:" + netSalary);
	}

	public static void main() {
		Employee emp = new Employee();
		emp.accept();
		emp.allowance();
		emp.gross();

	}
}
