package basic.java8features;

public class LambdaEx1 {
@FunctionalInterface
	interface Addable{
		int add(int p,int q);
		
	}
	public static void main(String[] args) {
		Addable a1 = (x,y)-> x+y;
		System.out.println("add : "+a1.add(12, 2));
	}
}
