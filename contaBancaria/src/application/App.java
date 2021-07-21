package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class App {

	public static void main(String[] args) {
		int numberConta;
		double deposito;
		double saque;
		String usuario;
		String choiseDeposit;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");	
		numberConta = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter account holder: ");
		usuario = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)? ");
		choiseDeposit = sc.nextLine();
		
		ContaCorrente conta = new ContaCorrente(numberConta, usuario);
		
		if (choiseDeposit.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			deposito = sc.nextDouble();
			conta.deposit(deposito);
		}

		System.out.println("\nAccount data:");
		System.out.println(conta);

		System.out.println("Enter a deposit value: ");
		deposito = sc.nextDouble();
		conta.deposit(deposito);

		System.out.println("\nUpdate account data:\n" + conta);

		System.out.println("Enter a withdraw value: ");
		saque = sc.nextDouble();
		conta.withdraw(saque);

		System.out.println("\nUpdate account data:\n" + conta);

		sc.close();
	}
}
