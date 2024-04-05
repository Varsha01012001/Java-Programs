package String;

import java.util.Scanner;

public class CountNumberOfWordsString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String word[] = s.split("");
		int count = 0;
		for (int i = 0; i<word.length; i++) {
			count++;
		}
		System.out.println("Number of words : " + count);
	}
}
