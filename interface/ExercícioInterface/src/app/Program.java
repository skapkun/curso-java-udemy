package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.*;
import model.service.*;

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data: ");
		System.out.print("Car model: ");
		String carModel = sc.nextLine(); 
		System.out.print("Pickup (dd/MM/yyyy hh:ss): "); 
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);  
		System.out.print("Return (dd/MM/yyyy hh:ss): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt); 
		
		CarRental carRental = new CarRental (start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: "); 
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: "); 
		double pricePerDay = sc.nextDouble(); 
		
		RentalService rentalService = new RentalService (pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.procressInvoice(carRental);
		
		System.out.println(); 
		System.out.println("FATURA: "); 
		System.out.println ("Pagamento básico: " + String.format("%.2f",carRental.getInvoice().getBasicPayment())); 
		System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f",carRental.getInvoice().getTotalPayment()));
		sc.close(); 
	}
}
