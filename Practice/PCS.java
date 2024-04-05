package Practice;

import java.util.Scanner;

public class PCS {
	int studeid;
	String studeName;
	float Chem , Bio , Math;
	
	//Default
	
	public PCS() {
		studeid = 01;
		studeName = "Riya";
		Chem = 68;
		Bio = 89;
		Math = 69;
		}
	
	//Parameterized 
	
	public PCS(int studeid,String studeName,float Chem,float Bio,float Math) {
		this.studeid=studeid;
		this.studeName=studeName;
		this.Chem=Chem;
		this.Bio=Bio;
		this.Math=Math;	
	}
	
	public void calculate() {
		float total , percentage;
		total = Chem+Bio+Math;
		percentage=total/3;
		System.out.print("Enter the studeid"+studeid);
		System.out.print("Enter studeName"+studeName);
		System.out.print("Enter Chem"+Chem);
		System.out.print("Enter Boi"+Bio);
		System.out.print("Enter Math"+Math);
		System.out.print("total"+total);
		System.out.print("percentage"+percentage);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Studeid");
		int Studeid=sc.nextInt();
		
		System.out.print("Enter StudeName");
		String StudeName=sc.nextLine();
		
		System.out.print("Enter Chem");
		float Chem=sc.nextFloat();
		
		System.out.print("Enter Bio");
		float Bio=sc.nextFloat();
		
		System.out.print("Enter Math");
		float Math=sc.nextFloat();
		
		PCS Stude1=new PCS(Studeid,StudeName,Chem,Bio,Math);
		Stude1.calculate();
		
		PCS Stude2=new PCS();
		Stude2.calculate();
		}
	}
	
