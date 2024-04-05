package ClaaandObject;

import java.util.Scanner;

public class Practice {
	String studentName;
	int studentRollNo;
	float css, python, java;
	float marks;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter studentName:");
		studentName = sc.nextLine();

		System.out.println("Enter studentRollNo:");
		studentRollNo = sc.nextInt();

		System.out.println("Enter subject css,python,java:");
		css = sc.nextFloat();
		python = sc.nextFloat();
		java = sc.nextFloat();

		System.out.println("Enter the marks:");
		marks = sc.nextFloat();
	}

	public void calculate() {
		float total, percent;
		total = css + python + java;
		percent = total / 3;
		System.out.println("Enter studentName: " + studentName);
		System.out.println("Enter studentRollNo:" + studentRollNo);
		System.out.println("Enter subject (css),(python),(java)" + (css) + (python) + (java));
		System.out.println("Enter the Marks:" + marks);
	}

	public static void main(String[] args) {
		Practice stud1 = new Practice();
		stud1.accept();
		stud1.calculate();

		Practice stud2 = new Practice();
		stud2.accept();
		stud2.calculate();
	}
}