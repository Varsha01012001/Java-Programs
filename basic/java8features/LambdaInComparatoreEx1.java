package basic.java8features;

import java.util.ArrayList;
import java.util.Collections;

class product {
	int ProductId;
	String ProductName;
	float ProductPrice;

	public product(int ProductId, String ProductName, float ProductPrice) {
		super();
		this.ProductId = ProductId;
		this.ProductName = ProductName;
		this.ProductPrice = ProductPrice;
	}

	@Override
	public String toString() {
		return "product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ "]";
	}
}
public class LambdaInComparatoreEx1 {
	public static void main(String[] args) {
		ArrayList<product> list = new ArrayList<>();
		{
			list.add(new product(101, "Mouse", 1200));
			list.add(new product(102, "Keyboard", 2000));
			list.add(new product(103, "Laptop", 80000));
			list.add(new product(104, "Printer", 25000));
			list.add(new product(105, "Speaker", 3500));

			Collections.sort(list, (p1, p2) -> {
				return p1.ProductName.compareTo(p2.ProductName);
			});
			list.forEach(p -> System.out.println(p));

			System.out.println();

			Collections.sort(list, (p1, p2) -> {
				if (p1.ProductPrice == p2.ProductPrice) {
					return 0;
				} else if (p1.ProductPrice > p2.ProductPrice) {
					return 1;
				} else {
					return -1;
				}
			});

			list.forEach(p -> System.out.println(p));
			
		}
	}
}
