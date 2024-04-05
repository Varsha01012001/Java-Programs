package collection;
import java.util.*;
	
	class Pro {
	    private int id;
	    private String name;
	    private double price;

	    public Product(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	}

	public class ProductManager {
	    private List<Product> products;

	    public ProductManager() {
	        products = new ArrayList<>();
	    }

	    // Add a product
	    public void addProduct(Product product) {
	        products.add(product);
	        System.out.println("Product added successfully.");
	    }

	    // Update a product
	    public void updateProduct(int id, String name, double price) {
	        for (Product product : products) {
	            if (product.getId() == id) {
	                product.setName(name);
	                product.setPrice(price);
	                System.out.println("Product updated successfully.");
	                return;
	            }
	        }
	        System.out.println("Product with ID " + id + " not found.");
	    }

	    // Get product by ID
	    public Product getProductById(int id) {
	        for (Product product : products) {
	            if (product.getId() == id) {
	                return product;
	            }
	        }
	        return null;
	    }

	    // Delete product by ID
	    public void deleteProductById(int id) {
	        Iterator<Product> iterator = products.iterator();
	        while (iterator.hasNext()) {
	            Product product = iterator.next();
	            if (product.getId() == id) {
	                iterator.remove();
	                System.out.println("Product deleted successfully.");
	                return;
	            }
	        }
	        System.out.println("Product with ID " + id + " not found.");
	    }
	    
	    // Get all products
	    public List<Product> getAllProducts() {
	        return products;
	    }																			
	    `
	    
	    
	    
	    
	    	
	    public static void main(String[] args) {
	        ProductManager manager = new ProductManager();

	        // Adding products
	        manager.addProduct(new Product(1, "Product A", 10.99));
	        manager.addProduct(new Product(2, "Product B", 20.99));

	        // Updating product
	        manager.updateProduct(1, "Updated Product A", 15.99);

	        // Getting product by ID
	        Product product = manager.getProductById(1);
	        if (product != null) {
	            System.out.println("Product ID: " + product.getId());
	            System.out.println("Product Name: " + product.getName());
	            System.out.println("Product Price: " + product.getPrice());
	        }

	        // Deleting product by ID
	        manager.deleteProductById(2);
	        
	        // Getting all products
	        List<Product> allProducts = manager.getAllProducts();
	        System.out.println("All Products:");
	        for (Product p : allProducts) {
	            System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Price: " + p.getPrice());
	        }
	    }
	}
