package application;
import java.util.Scanner; 
import java.util.Locale; 
import entities.CurrencyConverter;

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		double dollarPrice, dollars,  AmountInReais; 
	 
		
		System.out.print("What is the dollar price? ");
		dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		dollars = sc.nextDouble();
	
		System.out.printf("Amount to be paid in reais = %.2f ", CurrencyConverter.Converter(dollarPrice, dollars));
 
		sc.close();
	}

}
