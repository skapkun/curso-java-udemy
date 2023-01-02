package app;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Department;
import entities.HourContract;
import java.util.Locale;
import entities.Worker;
import entities.Enums.*;

public class Program {
	public static void main (String [] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		
		System.out.print("Enter department's name: "); 
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: "); 
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine(); 
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker (name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		Integer nro = sc.nextInt(); 
		
		for (int i = 0; i < nro; i++) {
		System.out.println("Enter contract #" + i + " data: ");
		System.out.print("Date (DD/MM/YYYY): ");
		Date contractDate = sdf.parse(sc.next());
		System.out.print("Value per hour: ");
		Double valuePerHour = sc.nextDouble();
		System.out.print("Duration (hours): ");
		Integer hours = sc.nextInt();
		
		HourContract contract = new HourContract (contractDate, valuePerHour, hours); 
		worker.addContract(contract); 
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println ("Name: "+ worker.getName());
		System.out.println ("Department: " + worker.getDepartment().getName()); 
		System.out.println ("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
	 
		
		sc.close(); 
	}

}
