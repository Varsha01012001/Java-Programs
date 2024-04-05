package collection;

public class Book {

		private int id;
		private String title;
		private String author;
		public Book(int id,String title,String author) {
			this.id=id;
			this.title=title;
			this.author=author;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
		}
		
		public Integer getId() {
			// TODO Auto-generated method stub
			return null;
		}
		public void setTitle(String string) {
			// TODO Auto-generated method stub
			
		}
}
