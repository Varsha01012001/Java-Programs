package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

		
		public class Percentage
		{

			public static void main(String[] args) throws  NumberFormatException, IOException
			{
				int id;
				String name;
				double phy,chem,bio,total,percentage;
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Id:");
				id=Integer.parseInt(reader.readLine());
				System.out.println("Enter Name");
				name=reader.readLine();
				System.out.println("Enter marks of phy , chem and bio:");
				phy = Double.parseDouble(reader.readLine());
				chem = Double.parseDouble(reader.readLine());
				bio = Double.parseDouble(reader.readLine());
				
				total = phy +chem +bio;
				percentage = total/3;
				
				System.out.println("Student Id : "+id+"\nName : "+name);
				System.out.println("Total : "+total+"\nPercent:"+percentage);
				
				
				}

			
}

