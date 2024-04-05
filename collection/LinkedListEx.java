package collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> linkedlist = new LinkedList();
		linkedlist.add("Apple");
		linkedlist.add("Mango");
		linkedlist.add("Banana");
		linkedlist.add(1,"Grapes");
		linkedlist.add(null);
		
		for(String string : linkedlist)
		{
			System.out.println(string);
		}
		
		LinkedList<String> linkList2 = new LinkedList<>();
		linkList2.add("Jasmin");
		linkList2.add("Rose");
		
		linkedlist.addAll(linkList2);
		System.out.println("adding list 2 in list 1:"+linkedlist);
		
		
	}

}
