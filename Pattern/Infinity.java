package Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Infinity {            //parameter      //2ed parameter
	public static boolean infinity(String infStr, String toFind) {
		
		if (toFind.length() < infStr.length() && !infStr.contains(toFind)) {
			
			return false;
		}
		String replaceStr = infStr; // repalceStr = ghijk
		while (replaceStr.length() < toFind.length() * 3) {
			replaceStr += infStr;//replace=replace + infStr
		}
		return replaceStr.contains(toFind);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();// str = ghijk ghijkghi
		// int t = str.length();
		String words[] = str.split(" ");
		String a = words[0];// a=ghijk
		String b = words[1];// b=ghijkghi
		if (infinity(a, b)) {// infStr(ghijk,ghijkghi)
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
