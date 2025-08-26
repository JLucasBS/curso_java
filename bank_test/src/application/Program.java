package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountUserName = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		String initialDeposit = sc.next();

		Account account;
		if (initialDeposit.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			account = new Account(accountNumber, accountUserName, value);
		} else {
			account = new Account(accountNumber, accountUserName);
		}

		System.out.println();
		System.out.println(account);

		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: " + account);

		System.out.print("\nEnter a withdrawal value: ");
		double withdrawalValue = sc.nextDouble();
		account.withdrawal(withdrawalValue);
		System.out.println("Updated account data: " + account);

		sc.close();
	}
}
