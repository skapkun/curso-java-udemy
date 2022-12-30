package application;
import java.util.Locale;
import java.util.Scanner; 

/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
 
 */

public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Entre com o tamanho do vetor: ");
		int n = sc.nextInt(); 
		
		double [] vet = new double [n];
		double sum = 0.0;
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Entre com um nro: ");
			vet[i] = sc.nextDouble(); 
			sum += vet[i]; 
		}
		double media = sum/vet.length; 
		System.out.printf("Media: %.3f", media);
	
		System.out.printf("\nELEMENTOS ABAIXO DA MEDIA: \n");
		for (int i = 0; i < vet.length; i++) {
			 if (vet[i]<media) {
				 System.out.printf("\n%.1f", vet[i]);
			 }
		}
		 
		
		sc.close();
	}

}
