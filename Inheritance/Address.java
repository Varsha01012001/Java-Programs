package Inheritance;

public class Address {
	String addressline;
	String street;
	String City;
	String State;
	int Pincode;

	public Address() {
		addressline = "Dehu";
		street = "nigadi";
		City = "pune";
		State = "maha";
		Pincode = 412;
	}

	public Address(String addressline, String street, String City, String State, int Pincode) {
		this.addressline = addressline;
		this.street = street;
		this.City = City;
		this.State = State;
		this.Pincode = Pincode;

	}

	public void display() {
		System.out.println(addressline + "," + street + "," + City + "-" + State + "," + Pincode + ",");
	}
}
