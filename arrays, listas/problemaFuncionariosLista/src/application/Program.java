package application;
import java.util.Scanner; 
import java.util.Locale; 
import entities.DadosFuncionario;
import java.util.List;
import java.util.ArrayList;


public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Entre com a quantidade de funcionarios que deseja inserir: ");
		int n = sc.nextInt();
		
		List <DadosFuncionario> listaFuncionarios = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			Integer id;
			String name;
			Double salary; 
			System.out.printf ("Employee #%d\n", i);
			System.out.print ("Id: "); 
			id = sc.nextInt(); 
			while (hasId(listaFuncionarios, id)) {
				System.out.print ("Id already taken! Try again:  "); 
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble(); 
			
			DadosFuncionario func = new DadosFuncionario(id, name, salary);
			listaFuncionarios.add(func); 
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int auxId = sc.nextInt();
		//Integer pos = position (listaFuncionarios, auxId);
		DadosFuncionario func = listaFuncionarios.stream().filter(x -> x.getId() == auxId).findFirst().orElse(null); 
		if (func == null) {
			System.out.println("This id does not exist!");
		}
		else {
		System.out.print("Enter the percentage: ");
		double perc = sc.nextDouble();
		//listaFuncionarios.get(func).aumentoSalario(perc); 
		func.aumentoSalario(perc);
		} 
		 
		 for (DadosFuncionario x : listaFuncionarios) { 
			 System.out.println(x);
		 }
		
		sc.close();
	}

	public static Integer position(List <DadosFuncionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		} return null;
	}
	
	public static boolean hasId (List<DadosFuncionario> list, int id) {
		DadosFuncionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); 
		return func != null;
	}
}
