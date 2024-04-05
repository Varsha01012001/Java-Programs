package collection;

import java.util.ArrayList;

public class CrudInsertDelete {

	public CrudInsertDelete() {
		ArrayList<String> items = new ArrayList<>();

		// create

		items.add("Rose");
		items.add("Lilly");
		items.add("Lotus");
		items.add("Mogra");

		// read

		System.out.println(" list of item :");
		for (String item : items) {
			System.out.println(items);
		}
		System.out.println();
	}
//update

	void update() {
		int indexToUpdate = 1 ; 
		if(indexToUpdate>=0 && indexToUpdate < item.size()) {
			item.set(indexToUpdate,"Lotus");
			System.out.println("Items at index "+ indexToUpdate);
		}
		else {
			System.out.println("invalid index for updating");
		}
		
		//read after update
		
		System.out.println("\nList of items after update:");
		for(String items :items) {
			System.out.println(item);
		}
	}

	public void remove() {
		1.remove("Mogra");
		1.remove(2);
		
		System.out.println("after removing specific element list is:");
		for(String items :1) {
			System.out.println(items);
		}
	}

	public static void main(String[] args) {
		CrudInsertDelete obj = new CrudInsertDelete();
		obj.create();
		obj.update();
		obj.remove();
	}
}
