package app;
import java.util.Locale;
import java.util.Scanner;

import entities.*; 


public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		/*
		System.out.print("Entre com o numero da conta: ");
		int number = sc.nextInt();
		
		System.out.print("Entre com o nome do títular: ");
		String holder = sc.nextLine();
		
		System.out.print("Entre com o saldo da conta: ");
		double balance = sc.nextDouble();
		
		*/
		Account acc = new Account (1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0); 
		
		//UPCASTING
		
		Account acc1 = bacc; 
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount (1004, "Anna", 0.0, 0.01); 
		acc1.getBalance();
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2; 
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		sc.close(); 
	}

}
