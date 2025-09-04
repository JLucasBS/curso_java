package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NumberWrapper;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		
		int numbersToRead = sc.nextInt();

		NumberWrapper[] vect = new NumberWrapper[numbersToRead];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = new NumberWrapper(sc.nextInt());
		}
		
		System.out.println("Numeros negativos: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumberWrapper() < 0) {
				System.out.println(vect[i].getNumberWrapper());
			}
			
		}
		
		sc.close();
	}

}
