package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;
import entities.Enums.Color;

public class Program {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <Shape> list = new ArrayList <>(); 
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Shape #%d data: ", i+1);
			System.out.print("\nRectangle or Circle (r/c)? ");
			char c = sc.next().charAt(0); 
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (c == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Shape shape = new Rectangle (color, width, height);
				list.add(shape);
			}
			else if ( c == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Shape shape = new Circle (color, radius);
				list.add(shape);
			}
		}
		
		for (Shape x : list) {
			System.out.println(String.format("%.2f", x.area()));
		}
		
		
		
		
		
		sc.close();
		
	}

}
