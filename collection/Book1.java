package collection;

public class Book1 {

	public Book1() {
		
		class <Book1> implements Comparable<Book1> {
			int id;
			String name, author, publisher;
			int qantity;

			public void Book1(int id, String name, String author, String publisher, int quantity) {
				this.id = id;
				this.name = name;
				this.author = author;
				this.publisher = publisher;
				this.qantity = quantity;
			}

			public int compareTo(Book1 b) {
				if (id > b.id) {
					return 1;
				} else if (id < b.id) {
					return -1;
				} else {
					return 0;
				}
			}
		}

	}

}
