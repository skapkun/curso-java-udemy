package model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Contract {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: "); 
		System.out.print("Numero: "); 
		int num = sc.nextInt(); 
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDateTime dateContract = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: "); 
		double valor = sc.nextDouble(); 
		System.out.print("Entre com o numero de parcelas: ");
		int qtdParcelas = sc.nextInt(); 
		System.out.println("Parcelas: "); 
		
		
	}

}
