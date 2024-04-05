package abstraction;

import java.util.Scanner;

abstract class Bank {
	public abstract double getRateOfInterest();
}

class Axis extends Bank {
	@Override
	public double getRateOfInterest() {
		return 8.5;
	}
}

class sbi extends Bank {
	public double getRateOfInterest() {
		return 6.2;

	}

}

public class TestBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principleAmt, years, ratesbi, rateAxis;
		System.out.println("Enter principle amount and no.of years:");
		principleAmt = sc.nextDouble();
		years = sc.nextDouble();

		Bank bank;

		bank = new sbi();
		ratesbi = bank.getRateOfInterest();

		bank = new Axis();
		rateAxis = bank.getRateOfInterest();

		double interestsbi = principleAmt * years * ratesbi / 100;
		double interestAxis = principleAmt * years * rateAxis / 100;

		System.out.println("simple interest of SBI:" + interestsbi);
		System.out.println("simple interest of Axis:" + interestAxis);
	}
}
