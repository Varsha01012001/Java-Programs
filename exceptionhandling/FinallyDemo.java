package exceptionhandling;

import Interface.Printable;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("case 1: whre exception doesn't occur");
		try {
			int a = 10/5;
			System.out.println("Div : "+a);
		}
		catch (ArithmeticException e) { 
			e.printStackTrace();
	}
		finally {
			System.out.println("Case1: always executes");
		}
		System.out.println("case2: whre exception doesn't occure");
		try {
			int a = 10/0;
			System.out.println("Div : "+a);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
	}
		finally {
			System.out.println("case2 :always executes");
		}
		System.out.println("case3: where exception occures and does not handled");
		try {
			String s=null;
			System.out.println(s.length());
		    }
		/*catch (ArithmeticException e) {
			e.printStackTrace();
		}*/
		finally {
			System.out.println("case 3: always executes");
		}
		System.out.println("rest of code.....");

     }
}
