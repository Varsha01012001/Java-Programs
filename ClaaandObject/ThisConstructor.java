package ClaaandObject;

public class ThisConstructor {
	String str;
	int n;

	public ThisConstructor() {
		this("Hello User!!!"); // calling string parameterized
	}

	public ThisConstructor(String str) {
		this(10);
		this.str = str;
	}

	public ThisConstructor(int n) {
		this.n = n;
	}

	public void print() {
		System.out.print(n + " " + str);
	}

	public static void main(String[] args) {
		ThisConstructor obj = new ThisConstructor();
		obj.print();

	}

}
