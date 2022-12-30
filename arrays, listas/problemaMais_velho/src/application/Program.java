package application;
import java.util.Locale;
import java.util.Scanner; 

/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
 */
public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Entre com o tamanho do vetor: ");
		int n = sc.nextInt(); 
		
		String [] vetNomes = new String [n]; 
		int [] vetIdades = new int [n]; 
		
		for (int i = 0; i < vetNomes.length; i++) {
			System.out.print("Entre com um nome: ");
			sc.nextLine();
			vetNomes[i] = sc.nextLine();
			System.out.print("Entre com a idade: ");
			vetIdades[i] = sc.nextInt(); 
			
		}
		int aux = 0, pos=0; 
		for (int i = 0; i < vetNomes.length; i++) {
			if (vetIdades[i]>aux) {
				aux = vetIdades[i];
				pos = i; 
			}
			
		}
		
		System.out.printf("%s, %d ANOS", vetNomes[pos], vetIdades[pos]); 
		
		
		
		sc.close();
	}

}
