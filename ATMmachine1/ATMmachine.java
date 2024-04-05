package ATMmachine1;

import java.util.Scanner;

class ATM {
	float Balance;
	int PIN = 1234;

	public void createPIN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Create your PIN(4 digit)");
		PIN = sc.nextInt();
		System.out.println("PIN created Successfully!! ");
		System.out.println("Please remenber your PIN to access your account.");
		System.out.println("Returning to the main menu....");

		//menu();
	}

	public void Checkpin() {
		System.out.println("Enter Your PIN  : ");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();

		if (enterpin == PIN) {
			menu();
		} else {
			System.out.println("Enter a Valid PIN :");
		}
	}

	public void menu() {
		System.out.println("Enter Your Choice ");
		System.out.println("1.Check A/C Balance ");
		System.out.println("2.Withdraw Money");
		System.out.println("3.Deposit Money");
		System.out.println("4.EXIT");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		if (opt == 1) {
			checkBalance();
		} else if (opt == 2) {
			WithdrawMoney();
		} else if (opt == 3) {
			depositMoney();
		} else if (opt == 4) {

			return;

		} else {
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
		if (amount > Balance) {
			System.out.println("Insufficient Balence");
		} else {
			Balance = Balance - amount;
			System.out.println("Money Withdrawal Successeful");

		}
		menu();
	}

	public void depositMoney() {
		System.out.println("Enter the amount : ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money Deposited Successfully");
	}
}

public class ATMmachine {
	public static void main(String[] args) {
		

		ATM obj = new ATM();
		obj.createPIN();
		obj.Checkpin();
	}

}
