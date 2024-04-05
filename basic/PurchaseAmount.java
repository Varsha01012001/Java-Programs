package basic;

import java.util.Scanner;

public class PurchaseAmount {

	public static void main(String[] args) {
		
     double purchaseAmount,discountAmount;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the PurchaseAmount:");
     purchaseAmount=sc.nextDouble();
     discountAmount=sc.nextDouble();
     if(purchaseAmount >= 10000) {
    	 discountAmount = 0.1*purchaseAmount;
    	 }
     else {
    	 discountAmount=0.2*purchaseAmount;
    	 System.out.println("DiscountAmount on Purchase is:"+discountAmount);
     }
     }
	}
