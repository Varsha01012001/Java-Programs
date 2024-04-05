package Inheritance;
//has-a
public class Customer extends Person {
	String ProductName;
	int quantity, price, billAmount;

	Customer() {
		super();
		ProductName = "Pencil Box";
		price = 45;
		quantity = 4;
	}

	Customer(int id, String Name, MyDate dob, Address address, String Productname, int quantity,int price) {
		super(id, Name, dob, address);
		this.ProductName = ProductName;
		this.price = price;
		this.quantity = quantity;
	}

	public void calculateBillAmount() {
		billAmount = price * quantity;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("ProductName:" + ProductName);
		System.out.println("price: " + price);
		System.out.println("quantity: " + quantity);
		System.out.println("Bill Amount: "+billAmount);
	}
}
