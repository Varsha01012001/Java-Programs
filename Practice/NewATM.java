package Practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

class NewATM {
	
	float Balance = 20000.0f; // Initial balance
	int PIN;

	public void createPIN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Create a PIN (4 digits): ");
		PIN = sc.nextInt();
		System.out.println("PIN created successfully!");
		System.out.println("Please remember your PIN to access your account.");
		System.out.println("Returning to the main menu.....");
		

		Checkpin();
		
	}

	public void Checkpin() {
		System.out.println("Enter Your PIN  : ");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();

		if (enterpin == PIN) {
			menu();
		} else {
			System.out.println("Incorrect PIN.");

		}
	}

	public void menu() {
		System.out.println("Enter Your Choice ");
		System.out.println("1. Check A/C Balance ");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			checkBalance();
			break;
		case 2:
			WithdrawMoney();
			break;
		case 3:
			depositMoney();
			break;
		case 4:
			return;
		default:
			System.out.println("Enter a Valid Choice ");
		}
	}

	public void checkBalance() {
		System.out.println("Balance : " + Balance);
		menu();
	}

	public void WithdrawMoney() {
		System.out.println("Enter Amount to Withdraw : ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		
		if (amount >= Balance) {
			System.out.println("Insufficient Balance");
		} else {
			Balance = Balance - amount;
			System.out.println("Money Withdrawal Successful");
		}
		// Return to Menu after withdrawal
		menu();
	}
 
	public void depositMoney() {
		System.out.println("Enter the amount : ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		
		Balance = Balance + amount;
		
		System.out.println("Money Deposited Successfully");
		 // Return to menu after deposited 
		menu();
	}
	
	public static void main(String[] args) {
		
		LocalDate curreDate = LocalDate.now();
		System.out.print("Date : " + curreDate);
		
		LocalTime currenTime = LocalTime.now();
		System.out.println("\t Time :" + currenTime + "\n");
		System.out.println("Welcome SBI!");
        System.out.println("Hello, " + "Varsha Gawale");
 
		
		NewATM obj = new NewATM();
		obj.createPIN();
		
	}
}
