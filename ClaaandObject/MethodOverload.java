package ClaaandObject;

public class MethodOverload {
	public void area(float radius) {
		System.out.println("Area of Circle:"+(3.14*radius*radius));
	}
	public int area(int length,int breadth) {
		//system.out.println("Area of Rectangle:"+(length*breadth));
		return length*breadth;
	}
	public static void main(String[]args) {
		MethodOverload obj=new MethodOverload();
		obj.area(10);
		int res = obj.area(5,27);
		System.out.println("Area of Rectangle:"+res);
	}
}
