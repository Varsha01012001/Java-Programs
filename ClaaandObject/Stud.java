package ClaaandObject;

import java.util.Scanner;

public class Stud {
	int id;
	String Name;
	float java, php, python;
//default
	public Stud() {
		id = 101;
		Name = "varsha";
		java = 66;
		php = 69;
		python = 60;
	}
//parameterized
	public Stud(int id, String Name, float java, float php, float python) {
		this.id = id;
		this.Name = Name;
		this.java = java;
		this.php = php;
		this.python = python;
	}

	public void calculate() {
		float total, percent;
		total = java + php + python;
		percent = total / 3;
		System.out.println("Student id :" + id);
		System.out.println("Student Name :" + Name);
		System.out.println("java :"+java);
		System.out.println("php:"+php);
		System.out.println("python:"+python);
		System.out.println("Total:" + total);
		System.out.println("percent :" + percent);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		String Name = sc.nextLine();
		
		System.out.println("Enter java");
		float java = sc.nextFloat();
		
		System.out.println("Enter php");
		float php = sc.nextFloat();
		
		System.out.println("Enter python");
		float python = sc.nextFloat();

		Stud S1 = new Stud();
		S1.calculate();

		Stud S2 = new Stud(id,Name,java,php,python);
		S2.calculate();
	}
}
