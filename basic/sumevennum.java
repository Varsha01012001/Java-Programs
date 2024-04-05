package basic;

import java.util.Scanner;

public class sumevennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,sum=0;
      Scanner sc = new Scanner(System. in);
       for(i=50;i<=100;i++)
       {
		if(i%2==0)
        
		{
    	   sum=sum+i;
       }
		System.out.println(i);
	        }
	 System.out.println("Sum of even number"+sum);
      }
}