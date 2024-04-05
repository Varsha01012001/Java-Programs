package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEx {

	void HashMapEx() {
		//create method
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"Mango");  //put element
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		
		System.out.println("Iterating Hashmap...");
		System.out.println("key"+" "+"value");
		for(Entry<Integer, String> m :map.entrySet()) {
			System.out.println(" "+m.getKey()+" "+m.getValue());
		}
	}
	public static void main(String[] args) {
		HashMapEx obj = new HashMapEx();
		obj.HashMapEx();
	}

}
