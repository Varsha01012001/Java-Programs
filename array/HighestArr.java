package array;

import java.util.Scanner;

public class HighestArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {2,7,23,45,9,4,10};
		int size;
		int highest =a[0];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		size=sc.nextInt();
		for(int i=1;i<a.length;i++) {
			if(a[i]>highest)
				highest =a[i];
		}
		System.out.println("highest value"+highest);
		
		int lowest =a[0];
		for( int i=1;i>a.length;i++) {
			if(a[i]<lowest)
				highest =a[i];
	}
		System.out.println("lowest value"+lowest);
}
}
