package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		Person[] vect = new Person[sc.nextInt()];
		
		double sumHeight = 0.0;
		int nmenores = 0;
		
		int vectLength = vect.length;
		
		for (int i=0; i<vectLength; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			
			System.out.print("Nome: ");
			String name = sc.next();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			vect[i] = new Person(name, age, height);
			
			sumHeight += height;
			
			if (age <16) {
				nmenores++;
			}
		}
		
		System.out.printf("Altura media: %.2f\n", sumHeight/vectLength);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", ((double)nmenores / vectLength) * 100.0);
	    
	    for(int i=0; i<vectLength; i++) {
	        if (vect[i].getAge() < 16) {
	        	System.out.printf("%s\n", vect[i].getName());
	        }
	    }
		
		
		sc.close();

	}

}
