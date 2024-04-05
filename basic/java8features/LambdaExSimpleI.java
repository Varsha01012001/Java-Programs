package basic.java8features;


@FunctionalInterface
interface SimpleInterestable
{
	float SimpleInterest (float p , float n , float r);
	
}
public class LambdaExSimpleI {

	public static void main(String[] args) {
		
		SimpleInterestable s1 = (p,n,r) -> (p*n*r)/100; ;
		System.out.println("SimpleInterest :" + s1.SimpleInterest(2,5,2));
	}
}