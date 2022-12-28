package application;
import java.util.Locale;
import java.util.Scanner; 
import entities.Product;
public class Program {
	
	 	
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		 
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine(); 
		System.out.print("Price: R$  ");
		double price = sc.nextDouble(); 
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt(); 
		
		Product produto = new Product (name, price, quantity); 
		
		
		
		System.out.println(produto);
		produto.setName("Computador");
		
		 System.out.println("Updated name: "+ produto.getName());
		  
	 System.out.print("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt(); 
		produto.AddProducts(quantity);
		
		System.out.println(produto);
		
	 System.out.print("Enter the number of products to be removed from stock: ");
	 	quantity = sc.nextInt(); 
		produto.RemoveProducts(quantity);
		
		
		System.out.println(produto);
		
		
		sc.close(); 
	}

}