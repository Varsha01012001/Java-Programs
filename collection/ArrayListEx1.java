package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();        // non-generic list
		list.add("riya");
		list.add(101);
		list.add(89.50);
		list.add(true);
		list.add("riya");

		System.out.println("List elements : " + list);

		ArrayList<String> list2 = new ArrayList<>();           // Generic list
		list2.add("Rose");
		list2.add("Lilly");
		list2.add("Lotus");
		list2.add("Mogra");
		list2.add(null);

		System.out.println("Generic List : " + list2);

		System.out.println("iterating list using Iterator Interface : ");
		Iterator<String> iterator = list2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("iterating list using for each loop : ");
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println("After sorting : ");
		Collections.sort(list2);
		{
			System.out.println("String");
		}

	}

}
