package application;
import java.util.Locale;
import java.util.Scanner;

/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
 */

public class Program {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Entre como tamanho dos vetores: ");
		int n = sc.nextInt(); 
		
		int [] vetA = new int [n]; 
		int [] vetB = new int [n]; 
		int [] vetC = new int [n]; 
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.printf ("Vetor A [%d]: ", i);
			vetA[i] = sc.nextInt();
		}
		System.out.println ();
		for (int i = 0; i < vetB.length; i++) {
			System.out.printf ("Vetor B [%d]: ", i);
			vetB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i]; 
		}
		
		for (int i = 0; i < vetC.length; i++) {
			System.out.printf ("\nVetor C [%d]: %d ", i, vetC[i]);
		}
		
		
		sc.close();
	}

}
