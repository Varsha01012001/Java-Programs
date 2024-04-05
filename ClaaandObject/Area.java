package ClaaandObject;

import java.util.Scanner;

public class Area {
	public void mul(double base, double height)
	{
		System.out.println("Mul :"+(base*height));
	}
	
	//parameterized with return type 
	public double div(double base,double height){
		return base/height;
	}
	
	public static void main(String[] args) {
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter area of circle");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		ParameterizedMethodEx obj = new ParameterizedMethodEx();
		obj.mul(a,b);
		double res = obj.div(a, b);
		System.out.println("Div : "+res);
	}
}

