package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
   int rollNumber;
   String name;
public Student(int rollNumber, String name) {
	super();
	this.rollNumber = rollNumber ;
	this.name = name;
}
@Override
public String toString() {
	return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
}
   
}

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		Student student=new Student(101,"vrs");
		
		FileOutputStream fileOutputStream =new FileOutputStream("C:\\java1\\xyz.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(student);
		objectOutputStream.flush();
		System.out.println("Converted to byte Stream");
	}

}

