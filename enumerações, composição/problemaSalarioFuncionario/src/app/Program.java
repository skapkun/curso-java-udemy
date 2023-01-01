package app;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale; 
import entities.HourContract;
 

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 

		List <HourContract> list = new ArrayList <>();
		
		System.out.print("Enter department's name: "); 
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine(); 
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		System.out.print("How many contracts to this worker? ");
		Integer nro = sc.nextInt(); 
		for (int i = 0; i < nro; i++) {
		System.out.print("Enter contract #%d data"+i);
		System.out.print("Date (DD/MM/YYYY): ");
		sc.nextLine();
		//Date date = sc.n
		System.out.print("Value per hour: ");
		Double valuePerHour = sc.nextDouble();
		System.out.print("Duration (hours): ");
		Integer duration = sc.nextInt();
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.nextLine();
		
		}
		
		
		
		sc.close(); 
	}

}
