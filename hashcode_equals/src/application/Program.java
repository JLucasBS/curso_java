package application;

import model.entities.Client;

public class Program {

	public static void main(String[] args) {
	
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Alex", "alex2@gmail.com");
		Client c4 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		
		System.out.println(c1.equals(c4));
		System.out.println(c1 == c4);

		System.out.println(s1 == s2);
	}

}
