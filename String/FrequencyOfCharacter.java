package String;

import java.util.Scanner;

public class FrequencyOfCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String : ");
		String s=sc.next();
		System.out.print("Which character you want tow count frequency: ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(ch+"repeat"+count+"times");
		
	}

}
