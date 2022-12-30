package application;
import entities.individuos;
import java.util.Locale;
import java.util.Scanner;

/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 
 */

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		double aux=0.0, percentualMenores =0;
		int cont = 0;
		System.out.print("Entre com a quantidade de individuos deseja inserir: "); 
		int n = sc.nextInt(); 
		
		individuos [] pessoas = new individuos[n]; 
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.print("Entre com o nome: ");
			sc.nextLine(); 
			String nome = sc.nextLine(); 
			System.out.print("Entre com a idade: ");
			int idade = sc.nextInt(); 
			System.out.print("Entre com a altura: ");
			double altura = sc.nextDouble(); 
			pessoas[i] = new individuos (nome, idade, altura); 
			
		}
		
		for (int i = 0; i < pessoas.length; i++) {
			 aux += (double) pessoas[i].getAltura(); 
			
		}
		
		double media = aux/pessoas.length; 
		
		 
		System.out.print("SUB 16");
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade()<16) {
				System.out.println(pessoas[i].getNome());
				cont++;
				
			}
			 percentualMenores = ((double)cont / n) * 100.0;
		}
		System.out.printf("\nMEDIA: %.2f", media);
		System.out.printf("\nPERCENTUAL MENORES: %.1f", percentualMenores);
		 
		sc.close();
	}

}
