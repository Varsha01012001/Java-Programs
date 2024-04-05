package basic.java8features;

	@FunctionalInterface
	interface squarable
	{
		int square (int n);
		
	}
	public class LambdaExSquare {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			squarable s1 = (n) -> n * n ;
			System.out.println("Square :" + s1.square(5));
		}



}
