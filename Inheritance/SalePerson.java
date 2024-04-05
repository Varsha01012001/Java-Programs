package Inheritance;

public class SalePerson extends Employee {
	float sales, commission, totalSalary;

	public SalePerson() {
		super();
		sales = 70;
	}

	public SalePerson(int id, String name, MyDate dob, Address address, float perday, float workingdays, float sales) {
		super(id, name, dob, address, perday, workingdays);
		this.sales = sales;
	}

	@Override
	public void calculate() {
		super.calculate();
		if (sales > 95)
			commission = salary * 0.2f;
		else if (sales > 75)
			commission = salary * 0.15f;
		else if (sales > 60)
			commission = salary * 0.1f;
		else
			commission = 0;
		totalSalary = salary + commission;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("sales:" + sales);
		System.out.println("commission:" + commission);
		System.out.println("total Salary:" + totalSalary);
	}
}
