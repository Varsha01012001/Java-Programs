package collection;

import java.util.ArrayList;

class Student {
	int rollNo;
	String Name;
	int age;
	// parameterized

	public Student(int rollNo, String Name, int age) {
		super();
		this.rollNo = rollNo;
		this.Name = Name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", age=" + age + "]";
	}

	/*
	 * public void Student () { System.out.println("Enter rollNo:" + rollNo);
	 * System.out.println("Enter Name:" + Name); System.out.println("Enter age:" +
	 * age); }
	 */

}

//main 
public class StudentData {
	public static void main(String[] args) {

		Student s1 = new Student(101, "varsha", 22);
		Student s2 = new Student(102, "Riya", 23);
		Student s3 = new Student(103, "Kirti", 22);
		Student s4 = new Student(104, "Sukanya", 22);
		Student s5 = new Student(105, "Shera", 22);

		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);

		System.out.println("Student List :");

		for (Student String : a1) {
			System.out.println(String);
		}
	}
}
