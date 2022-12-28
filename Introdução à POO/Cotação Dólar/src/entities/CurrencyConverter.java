package entities;

public class CurrencyConverter {
	
	
	public static double Converter (double dollarPrice, double dollars) {
		 dollars += dollars * 6/100;
		 return dollars*dollarPrice; 
	}

}
