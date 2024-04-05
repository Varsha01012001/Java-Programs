package collection;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class AComparator implements Comparator<Person> {

		@Override
		public int compare(Person s1, Person s2) {
			// TODO Auto-generated method stub
			if (s1.age == s2.age) {
				return 0;
			} else if (s1.age > s2.age) {
				return -1;
			} else {
				return -1;
			}
		}
	}
	class NComparator implements Comparator<Person> {

		@Override
		public int compare(Person s1, Person s2) {
			// TODO Auto-generated method stub
			return s1.name.compareTo(s2.name);
		}
	}

	public class PersonComparatore{

		void ComparatorDemo() {
			ArrayList<Person> a1 = new ArrayList<Person>();
			a1.add(new Person(1, "teena", 42));
			a1.add(new Person(2, "leena", 32));
			a1.add(new Person(3, "reena", 52));
			
			System.out.println("Sorting by age");

			Collections.sort(a1, new AComparator());
			for (Person st : a1) {
				System.out.println(st.personId + " " + st.name + " " + st.age);
			}
			System.out.println("--------------------------");
	        
			System.out.println("Sorting by name");

			Collections.sort(a1, new NComparator());
			for (Person st : a1) {
				System.out.println(st.personId + " " + st.name + " " + st.age);
			}
			System.out.println("--------------------------");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PersonComparatore test = new PersonComparatore();
			test.ComparatorDemo();
		}

	}

