package ClaaandObject;

import java.util.Scanner;

public class AreaS {
	int a, b;

	public void mul(double base, double height) {
		System.out.println("Mul :" + (base * height));
	}

	public int square(int side) {
		return side * side;
	}

	public int rectangle(int length, int breadth) {
		return length * breadth;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter area of circle");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("Enter the square:");
		a = sc.nextInt();
		System.out.println("Enter the rectanagle");
		b = sc.nextInt();

	}

	public static void main(String[] args) {
		DefaultMethodEx AreaS = new DefaultMethodEx();
		AreaS.accept();
		// AreaS Areas1=new Areas1();

		int a = AreaS.add();
		int b = AreaS.sub();
		System.out.println("square : " + a);
		System.out.println("rectangle : " + b);

		ParameterizedMethodEx AreaS1 = new ParameterizedMethodEx();
		AreaS1.mul(a, b);
		double res = AreaS1.div(a, b);
		System.out.println("mul : " + a);
	}
}
