package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.*;
import entities.Enums.OrderStatus; 

public class Program {
	public static void main (String[]args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.println("Enter client data: "); 
		System.out.print("Name: "); 
		String name = sc.nextLine(); 
		System.out.print("Email: "); 
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): "); 
		Date birthDate = sdf.parse(sc.next());
		Client cliente = new Client (name, email, birthDate); 
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status =  OrderStatus.valueOf(sc.next()); 
		Order order = new Order(new Date(), status, cliente);
		System.out.print("How many items to this order? "); 
		int n = sc.nextInt(); 
		for (int i = 0; i < n; i++) {
			System.out.println ("Enter #" + i+ " item data: "); 
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine(); 
			System.out.print("Product price: "); 
			double productPrice = sc.nextDouble(); 
			System.out.print("Quantity: "); 
			Integer quantity = sc.nextInt();
			
			Product product = new Product (productName, productPrice); 
			OrderItem newOrder = new OrderItem (quantity, productPrice, product);
			order.addItem(newOrder);
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
	}

}
