package basic;

import java.util.Scanner;

public class dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
char ch;

Scanner sc=new Scanner(System.in);
do{
System.out.println("Enter Two numbers:");
a=sc.nextInt();
b=sc.nextInt();

c=a+b;
System.out.println("Addition: "+c);

System.out.println("Press Y to continue");
ch=sc.next().charAt(0);
	}
while(ch=='Y'||ch=='y');
}
}