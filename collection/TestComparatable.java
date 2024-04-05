package collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
void ComparableBook1() {
	
	ArrayList<Book1> b1=new ArrayList<Book1>();
	b1.add(new Book1(4,"Book4","Author4","Publisher4",12));
	b1.add(new Book1(2,"Book2","Author2","Publisher2",6));
	b1.add(new Book1(3,"Book3","Author3","Publisher3",9));
	b1.add(new Book1(5,"Book5","Author5","Publisher5",8));
	b1.add(new Book1(1,"Book1","Author1","Publisher1",10));
	
	System.out.println("***************Before Sorting******************");
	for(Book1 bk:b1){
		System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.qantity);
	}
	Collections.sort(b1);
	System.out.println("***************After Sorting********************");
	for(Book1 bk:b1){
		System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.qantity);
	}
}
public static void main(String args[]) {
	TestComparable test =new TestComparable();
	test.ComparableBook1();
	}
}
