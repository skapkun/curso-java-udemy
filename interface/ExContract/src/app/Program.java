package app;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

public class Program {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: "); 
		System.out.print("Numero: "); 
		int num = sc.nextInt(); 
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: "); 
		double valor = sc.nextDouble(); 
		
		
		Contract contract = new Contract (num, date, valor);
		
		
		System.out.print("Entre com o numero de parcelas: ");
		int qtdParcelas = sc.nextInt(); 
		ContractService contractService = new ContractService(new PayPalService());
		contractService.processContract(contract, qtdParcelas);
		
		System.out.println("Parcelas: "); 
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
