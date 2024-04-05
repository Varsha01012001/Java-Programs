package basic;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int n, fno=0,sno=1,tno,i;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		System.out.println(fno+""+sno);
		for(i=2;i<=n;i++) {
			tno=fno+sno;
			System.out.println(""+tno);
			fno=sno;
			sno=tno;
		}

	}

}
