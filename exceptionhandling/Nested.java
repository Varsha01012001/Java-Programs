package exceptionhandling;

import java.util.concurrent.ExecutionException;

public class Nested {
public static void main(String[] args) {
	try {
		try {
			String s= null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		try {
			String s1="abc";
			System.out.println(Integer.parseInt(s1));
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("another lines.....");
	}
	catch(Exception e) {
		e.printStackTrace();	}
  }
}
