package basic.java8features;

@FunctionalInterface
interface Persentable
{
	double Persentage (double m1,double m2,double m3);
	
}
public class Persentage {

	public static void main(String[] args) {
		
		Persentable p1 = (m1,m2,m3) -> 300/3 ;
		System.out.println("Circle :" + p1.Persentage(63, 56, 80));
	}
}








