package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NumberWrapper;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		
		NumberWrapper[] vect = new NumberWrapper[sc.nextInt()];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite o numero: ");
			vect[i] = new NumberWrapper(sc.nextDouble());
			
		}
		
		double soma = 0.0;
		
		System.out.print("VALORES = ");
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i].getNumberWrapper());
			soma += vect[i].getNumberWrapper();
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);
	    System.out.printf("MEDIA = %.2f\n", soma/vect.length);
		
		sc.close();
	}

}
