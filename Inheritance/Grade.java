package Inheritance;

public class Grade extends StudentI {
	String Grade;

	public Grade() {
		super();
	}

	public Grade(int id, String name, MyDate dob, Address address, int phy, int chem, int math,int total) {
		super(id, name, dob, address, phy, chem, math,total);
	}

	@Override
	public void calculate() {
		super.calculate();

		if (percent >= 80) {
			Grade = "A+";
		} else if (percent >= 70) {
			Grade = "A";
		} else if (percent >= 60) {
			Grade = "B+";
		} else if (percent >= 50) {
			Grade = "B";
		} else {
			Grade = "Fail";
		}
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Grade :" + Grade);
	}

}
