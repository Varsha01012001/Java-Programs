package basic.java8features;

@FunctionalInterface
interface Circleable
{
	double Circle (double r);
	
}
public class LambdaExCircle {

	public static void main(String[] args) {
		
         double pi= 3.14;
		Circleable c1 = (r) -> pi*r*r ;
		System.out.println("Circle :" + c1.Circle(2));
	}
}