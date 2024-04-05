package Inheritance;

public class StudentI extends Person {
	int phy, chem, math;
	int total;
	float percent;

	// default
	public StudentI() {
		phy = 69;
		chem = 63;
		math = 79;
		total = 259;
	}

	// Parameterizes
	public StudentI(int id, String name, MyDate dob, Address address, int phy, int chem, int math, int total){
		super(id, name, dob, address);
		this.phy = phy;
		this.chem = chem;
		this.math = math;
		this.total = total;
	}

	public void calculate() {
		total = phy + chem + math;
		percent = total / 3;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("percent:" + percent);
	}

}
