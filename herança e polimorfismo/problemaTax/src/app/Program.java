package app;
import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		List <TaxPayer> list = new ArrayList <>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt(); 
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d data:\n", i+1); 
			System.out.print("Individual or company (i/c)? "); 
			char c = sc.next().charAt(0); 
			System.out.print("Name: "); 
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: "); 
			double anualIncome = sc.nextDouble();
			if (c == 'i') {
				System.out.print("Health expenditures: "); 
				double healthExpenditures = sc.nextDouble();
				TaxPayer tP = new Individual (name, anualIncome, healthExpenditures); 
				list.add(tP); 
			}
			else if (c == 'c') {
				System.out.print("Number of employees: "); 
				int numberOfEmployees = sc.nextInt();
				TaxPayer tP = new Company (name, anualIncome, numberOfEmployees); 
				list.add(tP); 
			}
		}
		System.out.println("TAXES PAID: ");
		double sum =0.0; 
		for (TaxPayer x : list) {
			System.out.println (x.getName() + ": $ " + String.format("%.2f", x.totalTax()));
			sum+=x.totalTax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
