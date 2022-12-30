package application;
import entities.Product;
import java.util.Scanner; 
import java.util.Locale; 

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N; 
		double sum=0.0, media; 
		System.out.print("Entre com a qtdd de produtos: ");
		N = sc.nextInt(); 
		
		 
		Product [] vectProducts = new Product [N];
		
		for (int i = 0; i < vectProducts.length; i++) {
			
			System.out.print("Entre com o nome: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.print("Entre com o preço: ");
			double preco = sc.nextDouble(); 
			
			vectProducts[i] = new Product (name, preco);
			 
			
			
		}
			for (int i = 0; i < vectProducts.length; i++) {
				sum += vectProducts[i].getPreco(); 
				System.out.println(vectProducts[i]);
			
		}
		media = sum/vectProducts.length; 
		
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();
	}

}
