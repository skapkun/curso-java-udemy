package application;
import java.util.Scanner;

import entities.Student;

import java.util.Locale; 
 

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		Student student = new Student (); 
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		if (student.PontosFaltantes()>0.0) {
			System.out.printf("FINAL GRADE = %.2f", student.Media()); 
			System.out.printf("\nFAILED\nMISSING %.2f POINTS", student.PontosFaltantes());
		}
		else {
			System.out.printf("FINAL GRADE = %.2f", student.Media());
			System.out.println("\nPASS");
		}
		
		
		sc.close(); 
	}

}
