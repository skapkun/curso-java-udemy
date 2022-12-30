package application;
import java.util.Locale;
import java.util.Scanner; 

/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 
 */

public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		double sum=0.0;
		
		System.out.printf("Entre com o tamanho do vetor: "); 
		int n = sc.nextInt();
		double [] vect = new double [n]; 
		
		for (int i = 0; i < vect.length; i++) { 
			System.out.print("Entre com um numero: ");
			vect[i] = sc.nextDouble(); 
		}
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("\n[%d]: %.2f", i, vect[i]); 
			sum+=vect[i]; 
		}
		
		System.out.printf("\nSOMA: %.2f\nMEDIA: %.2f", sum, sum/vect.length);
		
		sc.close();
	}

}
