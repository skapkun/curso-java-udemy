package application;
import java.util.Locale;
import java.util.Scanner; 

/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */
public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner (System.in); 
		
		int n; 
		System.out.print("Entre com um nro positivo <= 10: ");
		n = sc.nextInt();
		while (n > 10 || n<=0) {
			System.out.print("Numero invalido! Entre com um nro positivo <= 10: ");
			n = sc.nextInt();
		}
		
		int vect [] = new int [n]; 
		
		for (int i = 0; i<n; i++) {
			System.out.print("Entre com um nro: ");
			vect[i]=sc.nextInt(); 
		}
		  
		for (int i = 0; i<n; i++) {
			if (vect[i]<0) {
				System.out.printf("\n[%d]: %d", i, vect[i]);
			}
		}
		
		sc.close(); 
	}

}
