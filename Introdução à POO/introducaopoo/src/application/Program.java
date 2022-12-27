package application;
import entities.Triangle; 
import java.util.Locale;
import java.util.Scanner; 
import java.lang.Math;

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		
		double p, areaX, areaY;
		Triangle x, y;
		
		x = new Triangle(); //instanciar p/ alocar memória, criar objeto na area heap.  
		y = new Triangle(); 
				
		System.out.print ("Enter the measures of triangle X: "); 
		x.a = sc.nextDouble(); 
		x.b = sc.nextDouble(); 
		x.c = sc.nextDouble(); 
		
		System.out.print("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble(); 
		y.b = sc.nextDouble(); 
		y.c = sc.nextDouble();
		
		
		p = (x.a + x.b + x.c)/2.00; 
		areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		
		p = (y.a + y.b + y.c)/2.00; 
		areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println ("Larger area: Y"); 
		}
		
		sc.close(); 
	}

}
