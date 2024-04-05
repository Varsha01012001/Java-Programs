package ClaaandObject;

import java.util.Scanner;

public class Carea {
	double Areacircle, pi = 3.14;
	int radius;

	// Default
	public Carea() {
		radius = 5;
	}
	// parameterize

	public Carea(double pi,int radius) {
		this.pi = pi;
		this.radius = radius;
		//this.Areacircle = Areaofcircle;
	}

	public void calculate() {
		double Areaofcircle = pi * radius * radius;
		System.out.println("Areacircle is :" + Areaofcircle);

	}

	public static void main(String[] args) {

		int radius; 
		double pi = 3.14,Areacircle;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = sc.nextInt();

		Carea a1 = new Carea();
		a1.calculate();

		Carea a2 = new Carea(radius,pi);
		a2.calculate();
	}
}
