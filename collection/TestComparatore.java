package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparatore {
	
		class AgeComparator implements Comparator<Student1>{

			@Override
			public int compare(Student1 s1, Student1 s2) {
				// TODO Auto-generated method stub
				
				if(s1.age==s2.age)
				{
				return 0;
				}
				else if(s1.age>s2.age)
				{
					return 1;
				}
				else
				{
					return -1;
				}
				
			}
			
		}

		 class NameOperator implements Comparator<Student1>{

			@Override
			public int compare(Student1 s1, Student1 s2) {
				// TODO Auto-generated method stub
				return s1.name.compareTo(s2.name);
			}
			 
		}


		public class TestComparator {
		void ComparatorDemo() {
			
			
			ArrayList<Student1>a1=new ArrayList<Student1>();
			a1.add(new Student1(1,"Teena",42));
			a1.add(new Student1(2,"Leena",23));
			a1.add(new Student1(3,"Reena",24));
		   
		     System.out.println("Sorting by age");
		     Collections.sort(a1,new AgeComparator());
		     for(Student1 st:a1)
		     {
		    	 System.out.println(st.rollNo+" "+st.name+" "+st.age);
		     }
		     
		     System.out.println("*******");
		     Collections.sort(a1, new NameOperator());
		     for(Student1 st:a1) {
		    	 System.out.println(st.rollNo+" "+st.name+" "+st.age);
		     }
		     System.out.println("*******");
		     
		     


		}

		public static void main(String args[]) {
			 TestComparator test=new TestComparator();
			 test.ComparatorDemo();
		}

		}


	}

