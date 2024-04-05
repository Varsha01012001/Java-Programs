package ClaaandObject;

import java.util.Scanner;

public class Cemployee {
	int empId;
	String empName;
	float workingday;
	float perday;

	// Default
	public Cemployee() {
		empId = 01;
		empName = "Riya";
		workingday = 31;
		perday = 28;
	}

	// Parameterized
	public Cemployee(int empId, String empName, float workingday, float perday) {
		this.empId = empId;
		this.empName = empName;
		this.workingday = workingday;
		this.perday = perday;
	}

	public void calculation() {
		float empsalary = workingday * perday;
		System.out.println("Enter empId" + empId);
		System.out.println("Enter empName" + empName);
		System.out.println("Enter workingday" + workingday);
		System.out.println("Enter perday" + perday);
		System.out.println("Enter empsalary" + empsalary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId:");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter empName:");
		String empName = sc.nextLine();

		System.out.println("Enter workingday:");
		float workingday = sc.nextFloat();

		System.out.println("Enter perday:");
		float perday = sc.nextFloat();

		Cemployee E1 = new Cemployee(empId, empName, workingday, perday);
		E1.calculation();

		Cemployee E2 = new Cemployee();
		E2.calculation();

		System.out.print(" ");
	}

}
