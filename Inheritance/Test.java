package Inheritance;

public class Test {

	public static void main(String[] args) {
		/*Person person =new Person();
		person.display();
		
		Person person2=new Person(102,"riya",new MyDate(23,11,2002),new Address("dehu","nigadi","pune","maha",412));
		person2.display();*/

		/*Employee employee=new Employee();
		employee.calculate();
		employee.display();
		
		Employee employee2=new Employee(102,"manas",new MyDate(12,4,1997),new Address ("dehu","nigadi","pune","maha",412),185,24);
	    employee2.calculate();
	    employee2.display();
		
		StudentI stud1=new StudentI();
		stud1.calculate();
		stud1.display();
		
		StudentI stud2 = new StudentI(102,"VARSHA",new MyDate(01,01,2001),new Address("Dehu","Nigadi","Pune","Maha",412),69,96,86,250 );
		stud2.calculate();
		stud2.display();
		
		SalePerson SalePerson = new SalePerson();
		SalePerson.calculate();
		SalePerson.display();
		
		SalePerson salePerson2 = new SalePerson(101,"varsha",new MyDate(04, 03, 2024),new Address("Dehu","Nigadi","Pune","Maha",412),1050,28,84);
		salePerson2.calculate();
		salePerson2.display();
		
		Grade obj= new Grade();
		obj.calculate();
		obj.display();
		
		Grade obj1=new Grade(1,"Riya",new MyDate(4, 3, 2024),new Address("Dehu","Nigadi","Pune","Maha",412), 90, 89, 90,300);
		obj1.calculate();
		obj1.display();*/
		
		DiscountC c1=new DiscountC();
		c1.calculateBillAmount();
		c1.display();
		
		DiscountC c2 = new DiscountC(101,"riya",new MyDate(4,3,2024),new Address("dehu","nigadi","pune","pune","maha",412),"Notebook",105,210);
	    c2.calculateBillAmount();
		c2.display();
		
		
		}

}
