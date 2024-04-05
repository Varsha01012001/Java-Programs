package basic;

import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		
int noofCalls,billAmount;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of Calls: ");
noofCalls = sc.nextInt();
if(noofCalls<200) {
	billAmount = noofCalls*1;
}
else {
	billAmount=noofCalls*3;
}
	
System.out.println("Bill Amount : "+billAmount);

	}

}


