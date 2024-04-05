package ClaaandObject;

import java.util.Scanner;

public class DefaultArea {
int a,b;
	
	//default method without return type
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Area of square:");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	
	//default method with return type
	public int square(int side){
		return side*side;
	}
	
	public int rectangle(int length, int breadth) {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		DefaultMethodEx obj = new DefaultMethodEx();
		obj.accept();
		int a = obj.add();
		int b = obj.sub();
		System.out.println("square : "+a);
		System.out.println("rectangle : "+b);
	}
}

