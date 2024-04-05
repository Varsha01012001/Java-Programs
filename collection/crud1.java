package collection;

import java.util.ArrayList;
import java.util.List;

public class crud1 {

	public crud1() {
		// TODO Auto-generated constructor stub
			List<String> list2 = new ArrayList<String>();
			public void create() {
				
				System.out.println("List created.....");
				list2.add("Rose");
				list2.add("Lily");
				list2.add("Mogara");
				
				System.out.println(" ArrayList after adding element: ");
				for(String name: list2) {
					System.out.println(name);
				}
		        }
			void update() {
				int indexAt=2;
				list2.set(indexAt,"Lotus");
				
				System.out.println("updated list: ");
				for(String name: list2) {
					System.out.println(name);
				}
		        }
			
			public void delete() {
				
				list2.remove(2);
				list2.remove("Mogara");
				System.out.println("after removing specific elements: ");
				for(String name: list2) {
					System.out.println(name);
				}
		        
			}
				
			public static void main(String[] args) {
				// TODO Auto-generated method stub

			crud1 Curd =new crud1();
			Curd.create();
			Curd.update();
			Curd.delete();
			
			

		}
    }
}
