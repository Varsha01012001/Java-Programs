package basic.java8features;

import java.util.ArrayList;
import java.util.Collections;

class Employees{
	int EmployeesId;
	String EmployeesName;
	int EmployeesAge;
	
	public Employees(int EmployeesId,String EmployeesName,int EmployeesAge) {
		super();
		this.EmployeesId=EmployeesId;
		this.EmployeesName=EmployeesName;
		this.EmployeesAge=EmployeesAge;
		
	}

	@Override
	public String toString() {
		return "Employees [EmployeesId=" + EmployeesId + ", EmployeesName=" + EmployeesName + ", EmployeesAge="
				+ EmployeesAge + "]";
	}
	
}
public class Employee {
	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<>();
		list.add(new Employees(1,"priya",26));
		list.add(new Employees(2,"Shreya",28));
		list.add(new Employees(3,"aradhya",30));
		list.add(new Employees(4,"Riya",20));
		list.add(new Employees(5,"Rina",29));
		
		Collections.sort(list,(E1,E2)->{
			return E1.EmployeesName.compareTo(E2.EmployeesName);
		});
		list.forEach(E->System.out.println(E));
	
	}
	
}
	


