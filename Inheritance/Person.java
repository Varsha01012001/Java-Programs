package Inheritance;

public class Person {
	int id;
	String Name;
	MyDate dob;
	Address address;

	public Person() {
		id = 101;
		Name = "varsha";
		dob = new MyDate();
		address = new Address();
		
	}
 
	public Person(int id,String Name,MyDate dob,Address address) {
		this.id = id;
		this.Name = Name;
		this.dob = dob;
		this.address = address;
	}

	public void display() {
		System.out.println("person id:" + id);
		System.out.println("persona Name:" + Name);
		dob.display();
		address.display();
	}

	public void calculate() {
		// TODO Auto-generated method stub
		
	}
}
