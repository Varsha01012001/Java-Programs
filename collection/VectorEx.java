package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector = new Vector<>();
		vector.addElement("Jasmin");
		vector.add("Rose");
		vector.add("Mogra");
		vector.add("Lotus");
		vector.add("Lilly");

		Enumeration<String> e = vector.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
