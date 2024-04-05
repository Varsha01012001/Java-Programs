package basic;

import java.util.Scanner;

public class AreaofCircle1 {

	public static void main(String[] args) {
		
		int length,width,AreaofRectangle;
		float Areaofcircle;
		
		float pi=3.14f, radius;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter length and width");
		length=sc.nextInt();
		width=sc.nextInt();
		
		AreaofRectangle=length*width;
		
		System.out.println("Area of Rectangle:"+AreaofRectangle);
		//Area of circle
		
		System.out.println("Enter radius of circle");
		radius=sc.nextInt();
		Areaofcircle= pi*radius*radius;
		
		
		System.out.println("Area of Circle :"+Areaofcircle);
			
	}

}