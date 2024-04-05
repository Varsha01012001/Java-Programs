package DoSelect;

import java.util.Scanner;
import java.util.stream.Collectors;

public class InsertSpace {
    //with Java8
	public String insertSpace(String s) {
		//using java 8 Stream API and lambda expression to insert
		return s.chars().mapToObj(c -> (char) c + " ")
				.reduce("",String::concat)
				.trim(); 
		
		// Remove trailing space
	}

	public static void main(String[] args) {
		InsertSpace source = new InsertSpace();
		// String input = "capgemini";

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println();
		String formattedString = source.insertSpace(str);
		System.out.println("Formatted string: " + formattedString);
	}
}