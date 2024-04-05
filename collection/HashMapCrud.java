package collection;

import java.util.HashMap;

public class HashMapCrud {

	void Crud() {

		HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();

		// create Books
		Book b1 = new Book(101, "Wings of Fire", "DR.APJ.Kalam");
		Book b2 = new Book(102, "Let us C", "Yashvant Kanetkar");
		Book b3 = new Book(103, "Operating System", "Galvin");

		// Add Books
		bookMap.put(b1.getId(), b1);
		bookMap.put(b2.getId(), b2);
		bookMap.put(b3.getId(), b3);
		
		// Read Books
			Book read1=bookMap.get(101);
			Book read2=bookMap.get(102);
			Book read3=bookMap.get(103);
			
			//display on console
			System.out.println("**************Book List****************");
			System.out.println(read1);
			System.out.println("----------------------------------------");
			System.out.println(read2);
			System.out.println("----------------------------------------");
			System.out.println(read3);
			System.out.println("----------------------------------------");
			
			//update Book
			if(read1!=null) {
				read1.setTitle("New Title");
				bookMap.put(read1.getId(), read1);
				System.out.println("**************update Book List****************");
				System.out.println("update Book : "+read1);
			}
	}
	public static void main(String[] args) {
		HashMapCrud obj = new HashMapCrud();
		obj.Crud();
	}
}