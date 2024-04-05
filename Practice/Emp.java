package Practice;

import Inheritance.MyDate;

public class Emp{
	int Con;
	String Name;
	String Add;
	String City;
	int id;

	public Emp() {
		Con = 369852;
		Name = "Riya";
		Add = "Pune";
		City = "Pune";
		id = new Person1();
	}

	public Emp(int Con, String Name, String Add, String City, int id) {
		this.Con = Con;
		this.Name = Name;
		this.Add = Add;
		this.City = City;
		this.id=id;
	}

	public void Emp() {
		System.out.println("Enter Con:" + Con);
		System.out.println("Enter Name:" + Name);
		System.out.println("Enter Add:" + Add);
		System.out.println("Enter City" + City);
		id.display();
	}

}