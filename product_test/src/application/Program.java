package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		product.fillProductData(sc);

		System.out.println("Product data: " + product);

		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println("Updated product data: " + product);

		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("Updated product data: " + product);

		sc.close();
	}

}
