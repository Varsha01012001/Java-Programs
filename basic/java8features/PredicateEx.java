package basic.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import exceptionhandling.Student;

public class PredicateEx {
public static void main(String[] args) {
 List<Student> list = new ArrayList<>();
 list.add(new Student(101,20,"Raj"));
 list.add(new Student(101,20,"Meera"));
 list.add(new Student(101,20,"Meena"));
 list.add(new Student(101,20,"Manas"));
 list.add(new Student(101,20,"Paras"));
 
 Predicate<Student> p1 = s-> s.getName().start
 
 
}
	
}


