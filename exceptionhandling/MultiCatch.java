package exceptionhandling;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[7] = 25 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
