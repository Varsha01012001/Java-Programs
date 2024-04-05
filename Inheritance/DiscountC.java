package Inheritance;

public class DiscountC extends Customer {
	float discount;

	public DiscountC() {
		super();
	}
	public DiscountC(int id, String Name, MyDate dob, Address address, String Productname, int quantity,int price) {
super(id,Name,dob,address,Productname,quantity,price);
}
public void calculateBillAmount() {
	super.calculateBillAmount();
	
	if(billAmount>20000) {
		discount = billAmount*0.15f;
	}else if(billAmount>15000) {
		discount=billAmount*0.1f;
	}
	else if(discount >10000) {
		discount=billAmount * 0.07f;
	}
	else {
		discount=billAmount * 0;
	}
		}
	@Override
public void display() {
		super.display();
		System.out.printf("Discount : %.2f",discount);
	}
}

