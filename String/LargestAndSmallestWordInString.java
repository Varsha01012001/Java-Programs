package String;

import java.util.Scanner;

public class LargestAndSmallestWordInString {
//program to find largest and smallest word in the string
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		String word[]=s.split(" ");
		
		String countLarge = word[0];
		String countsmall = word[0];
		for(int i = 0;i<word.length;i++) {
			
			if(word[i].length()<countsmall.length()) {
				countsmall =word[i];
			}
		
			if(word[i].length()>countLarge.length()) {
				countLarge = word[i];
			}
		}
		System.out.println("Largest Word:"+countLarge);
		System.out.println("Smallest Word:"+countsmall);
		}
}
