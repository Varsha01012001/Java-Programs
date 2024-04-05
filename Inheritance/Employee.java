package Inheritance;

public class Employee extends Person{
	float perday, workingdays, salary;

	public Employee() {
		super();// calls super class constructor
		this.perday = 12000;
		this.workingdays = 18;
	}

	public Employee(int id, String name, MyDate dob, Address address, float perday, float workingdays) {
		super(id, name,dob,address);
		this.perday = perday;
		this.workingdays = workingdays;
	}

	public void calculate() {
		salary = workingdays * perday;
	}
	
	@Override
	public void display() {
		
		super.display();     // calling parent class method
		System.out.println("salary:" + salary);
	}

}
