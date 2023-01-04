package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.*; 


public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		List <Employee> employee = new ArrayList <>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt(); 
		
		for (int i = 0; i < n; i++) {
			System.out.println ("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char validation = sc.next().charAt(0); 
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.print("Hours: "); 
			int hours = sc.nextInt(); 
			System.out.print("Value per hour: "); 
			double valuePerHour = sc.nextDouble(); 
			if (validation == 'y') {
				System.out.print("Additional charge: "); 
				double additional = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additional);
				employee.add(emp);
			}
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				employee.add(emp);
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee x : employee) {
			System.out.println (x); 
		}
		
		
		sc.close();
	}

}
