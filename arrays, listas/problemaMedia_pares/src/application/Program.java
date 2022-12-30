package application;
import java.util.Locale;
import java.util.Scanner; 

/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"  
 */
public class Program {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		int aux=0; 
		System.out.print("Entre com o tamanho do vetor: ");
		int n = sc.nextInt(); 
		
		int [] vet = new int [n]; 
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Entre com um nro: ");
			vet[i] = sc.nextInt(); 
		}
		int sum = 0;
		for (int i = 0; i < vet.length; i++) {
			  if (vet[i] % 2 == 0) { 
				  sum+=vet[i]; 
				  aux++;
			  }
		}
		 
		double media = (double)sum/aux;
		 
		if (sum!=0) {
			System.out.printf("%.1f", media);		 
		}
		else {
			System.out.printf("NENHUM NUMERO PAR");
		}
		   
		
		sc.close();
	}

}
