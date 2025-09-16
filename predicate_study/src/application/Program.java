package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		list.removeIf(new ProductPredicate()); -> implemetação da interface
//		list.removeIf(Product::staticProductPredicate); -> reference method com metodo estatico
//		list.removeIf(Product::nonStaticProductPredicate); -> reference method com metodo não estatico

		double min = 100.0;
		
//		Predicate<Product> pred = p -> p.getPrice() >= min; -> expressão lambda declarada
//		list.removeIf(pred);
		
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
