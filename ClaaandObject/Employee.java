package ClaaandObject;

import java.util.Scanner;

public class Employee {
	int empId;
	String empname;
	float workingdays;
	float perdaysalary;
	
	public void accept() 
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter empId: ");
	empId=sc.nextInt();
	sc.nextLine();
	
		System.out.println("Enter empname:");
		empname=sc.nextLine();
		
		System.out.println("Enter working day :");
		workingdays=sc.nextInt();
		
		System.out.println("Enter perdaysalary:");
		perdaysalary=sc.nextFloat();
			
		}
	public void calculate() 
	{
	    float empsalary = workingdays * perdaysalary; // Calculate the employee's salary
	    System.out.println("empId :" + empId);
	    System.out.println("emplname :" + empname);
	    System.out.println("workingdays:" + workingdays);
	    System.out.println("perdaysalary :" + perdaysalary);
	    System.out.println("empsalary :" + empsalary);   // Print the calculated salary
	}

	public static void main(String[] args) {
		
		Employee Employee1=new Employee();
		Employee1.accept();
		Employee1.calculate();
		
		Employee Employee2=new Employee();
		Employee2.accept();
		Employee2.calculate();
}
}