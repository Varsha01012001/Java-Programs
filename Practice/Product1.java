package Practice;

import java.util.ArrayList;
import java.util.List;

public class Product1 {

	//default
	
	class Product {
		private int id;
		private String name, description;
		private double price;

		//parameter
		
		public Product(int id, String name, String description, double price) {
			
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public double getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
		}

		public Product addProducts(Product product) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public class ProductList {
		private List<Product> productList;

		public ProductList() {
			this.productList = new ArrayList<>();
		}

		public void addProduct(Product product) {
			productList.add(product);
		}

		public void displayProducts() {
			for (Product product : productList) {
				System.out.println(product);
			}
		}

		public static void main(String[] args) {
			Product1 product = new Product1();

			// Add products
			
			
			product.addproducts(new Product(101, "Laptop", "HP", 80000));
			product.addProducts(new Product(102, "TV", "LG", 76000));
			product.addProducts(new Product(103, "Smart Phone", "Samsung", 25000));

			// Displaying products
			System.out.println("List of Products:");
			product.displayProducts();
		}
	}

}
