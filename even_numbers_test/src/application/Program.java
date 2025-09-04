package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NumberWrapper;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdPares = 0;

	    System.out.print("Quantos numeros voce vai digitar? ");

	    NumberWrapper[] vect = new NumberWrapper[sc.nextInt()];
	    
	    for (int i=0; i<vect.length; i++) {
	    	System.out.print("Digite um numero: ");
	    	int number = sc.nextInt();
	    	vect[i] = new NumberWrapper(number);
	    }
	    
	    System.out.println("\nNUMEROS PARES:");

	    for (int i=0; i<vect.length; i++) {
	        if (vect[i].getNumber() % 2 == 0) {
	        	System.out.printf("%d  ", vect[i].getNumber());
	        	qtdPares++;
	        }
	    }
	    
	    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdPares);
		
		sc.close();

	}

}
