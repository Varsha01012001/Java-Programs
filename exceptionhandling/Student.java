package exceptionhandling;

public class Student {

	static void findRollNumber(int RollNumber) throws StudentNotFoundException {
		if (RollNumber >= 1 && RollNumber <= 20)
			System.out.println("Student Found");
		else
			throw new StudentNotFoundException("Student Not Found"+ RollNumber);
	}

	public static void main(String[] args) {
		try {
			findRollNumber(22);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code.....");
	}
}
