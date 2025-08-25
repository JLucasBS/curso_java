package entities;

import java.util.Scanner;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public void fillProductData(Scanner sc) {
		System.out.println("Enter product data: ");
		System.out.print("Name:  ");
		name = sc.nextLine();
		System.out.print("Price:  ");
		price = sc.nextDouble();
		System.out.print("Quantity in Stock:  ");
		quantity = sc.nextInt();
	}
	
	public String toString() {
		return name
			+ ", $" 
			+ String.format("%.2f", price)
			+ ", " 
			+ quantity 
			+ " units, Total: $"
			+ String.format("%.2f", totalValueInStock());
	}
}
