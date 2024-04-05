package Practice;

import java.util.Scanner;

public class calculateSalary1 {

	String EmpName;
	int Salary;

	// Default

	public calculateSalary1() {
		EmpName = "Riya";
		Salary = 20000;
	}

	// Parameter

	public void calculaterSalary(String EmpName, int Salary) {
		this.EmpName = EmpName();
		this.Salary = Salary();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmpName : " + EmpName);
		String EmpName = sc.nextLine();

		System.out.println("Enter Salary : " + Salary);
		int Slary = sc.nextInt();

	}

}
