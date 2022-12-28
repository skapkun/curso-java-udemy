package application;
import entities.ContaBanco; 
import java.util.Scanner; 
import java.util.Locale; 

public class Program {
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		ContaBanco cliente = new ContaBanco();
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt(); 
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine(); 
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDepositValidation = sc.next().charAt(0); 
		
		 if (initialDepositValidation != 'y' && initialDepositValidation != 'n') {
			System.out.print("Invalid character! Is there an initial deposit (y/n)? ");
			 initialDepositValidation = sc.next().charAt(0); 
		 }
			 else if (initialDepositValidation == 'y') { 
				System.out.print("Enter initial deposit: "); 
				double initialDeposit = sc.nextDouble(); 
					  cliente = new ContaBanco (accountNumber, accountHolder, initialDeposit); 
				}
					else if (initialDepositValidation == 'n') {
						  cliente = new ContaBanco (accountNumber, accountHolder); 
					}
		
		System.out.println ("Account data: ");
		System.out.print(cliente); 
		
		
		System.out.println ("\nEnter a deposit value: ");
		double amount = sc.nextDouble(); 
		cliente.deposito(amount); 
		
		System.out.println ("Updated account data: ");
		System.out.print(cliente); 
		
		System.out.println ("\nEnter a withdraw value: ");
		amount = sc.nextDouble(); 
		cliente.saque(amount); 
		System.out.println ("Updated account data: ");
		System.out.print(cliente); 
		
		sc.close();	
	}
}