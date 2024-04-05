package ClaaandObject;

import java.util.Scanner;

public class Student {
int rollNumber;
String name;
float java,cpp,python;
public void accept() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rollnumber:");
	rollNumber=sc.nextInt();
	sc.nextLine();
	
		System.out.println("Enter Name:");
		name=sc.nextLine();
		
		System.out.println("Enter marks pf java,cpp,python:");
		java=sc.nextInt();
		cpp=sc.nextFloat();
		python=sc.nextFloat();
		
}
public void calculate() {
	/*
	 * 2.Loacal variable:variable declaired inside a block or method
	 */
	float total,percent;
	total=java+cpp+python;
	percent = total/3;
	System.out.println("Student RollNumber :"+rollNumber);
	System.out.println("Student Nmae :"+name);
	System.out.println("Total:"+total);
	System.out.println("percent :"+percent);
	
}
public static void main(String[] args) {
	
	Student student1=new Student();
	student1.accept();
	student1.calculate();
}
	}


