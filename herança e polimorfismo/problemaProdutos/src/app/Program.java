package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class Program {
	public static void main (String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		List <Product> products = new ArrayList <>(); 
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println ("Product #" + i + " data: "); 
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = sc.next().charAt(0); 
			
			System.out.print("Name: "); 
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: "); 
			double price = sc.nextDouble();
			if (c == 'i') {
				System.out.print("Customs fee: "); 
				double fee = sc.nextDouble();
				Product product = new ImportedProduct (name, price, fee);
				products.add(product);
			}
			else if (c == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): "); 
				Date manufactureDate = sdf.parse(sc.next()); 
				Product product = new UsedProduct (name, price, manufactureDate); 
				products.add(product); 
			}
			else {
				Product product = new Product (name, price); 
				products.add(product);
			}
		}
		System.out.println(); 
		System.out.println("PRICE TAGS: ");
		for (Product x : products) {
			System.out.println(x.priceTag());
		}
		
		
		sc.close(); 
	}

}
