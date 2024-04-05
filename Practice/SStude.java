package Practice;

import java.util.Scanner;

public class SStude {
	int id;
	String Name;
	String Add;
	int Java, CPP, Python;

//default
	public SStude() {
		id = 01;
		Name = "Varsha";
		Add = "Dehu";
		Java = 86;
		CPP = 87;
		Python = 69;
	}

	// parameterize
	public SStude(int id, String Name, String Add, int Java, int CPP, int Python) {
		this.id = id;
		this.Name = Name;
		this.Add = Add;
		this.Java = Java;
		this.CPP = CPP;
		this.Python = Python;
	}

	public void calculate() {
		float total, percentage;
		total = Java + CPP + Python;
		percentage = total / 3;
		System.out.println("id" + id);
		System.out.println("Name" + Name);
		System.out.println("Add" + Add);
		System.out.println("Java" + Java);
		System.out.println("CPP" + CPP);
		System.out.println("Python" + Python);
		System.out.println("total" + total);
		System.out.println("percentage" + percentage);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name:");
		String Name = sc.nextLine();

		System.out.println("Enter the Add:");
		String Add = sc.nextLine();

		System.out.println("Enter the Java:");
		int Java = sc.nextInt();

		System.out.println("Enter the CPP:");
		int CPP = sc.nextInt();

		System.out.println("Enter the Python:");
		int Python = sc.nextInt();

		SStude St1 = new SStude();
		St1.calculate();

	}
}
