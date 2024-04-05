package ClaaandObject;

public class StsticEx {
	int rollNumber;
	String name;
	static String instituteName = "Edubridge Learning";

	public StsticEx() {  
		//Default Constructor 

	}

	public StsticEx(int rno, String nm) {
		rollNumber = rno;    // rollNumber=101
		name = nm;          // name = varsha
	}

	static {
		System.out.println("it is called before main()");
	}
	{
		System.out.println("instance block");
	}

	public void display() {
		System.out.println("RollNo : " + rollNumber);
		System.out.println("Name : " + name);
		System.out.println("Institute Name :" + instituteName);
	}

	public static void changeName(String newInstituteName) {
		instituteName = newInstituteName;
	}

	public static void main(String[] args) {
		StsticEx.changeName("EduBridge learning pvt.Ltd");

		StsticEx stud1 = new StsticEx(101, "sakshi");
		stud1.display();

		StsticEx stud2 = new StsticEx(102, "suraj");
		stud2.display();

	}

}
