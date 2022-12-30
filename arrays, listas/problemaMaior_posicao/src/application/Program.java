package application;
import java.util.Locale; 
import java.util.Scanner;

/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
 */

public class Program {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		double aux = 0.0; 
		int pos=0; 
		
		System.out.print("Entre com o tamanho do vetor: ");
		int n = sc.nextInt(); 
		
		double [] vet = new double [n]; 
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Entre com um numero: ");
			vet[i] = sc.nextDouble(); 
		}
		
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > aux) {
				aux = vet[i]; 
				pos = i; 		
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\nPOSICAO DO MAIOR VALOR = %d ", aux, pos);
		
		sc.close();
	}
}
