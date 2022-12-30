package application;
import java.util.Locale;
import java.util.Scanner;


/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. 
 */

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		int cont = 0; 
		
		System.out.print("Entre com o tamanho do vetor: ");
		int n = sc.nextInt(); 
		
		int [] vet = new int [n]; 
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Entre com um numero: ");
			vet[i] = sc.nextInt(); 
		}
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) { 
				System.out.printf("%d | ", vet[i]);
				cont++;
			}
		}
		
		System.out.printf("\nQuantidade de pares: %d", cont);
		
		
		
		sc.close();
	}

}
