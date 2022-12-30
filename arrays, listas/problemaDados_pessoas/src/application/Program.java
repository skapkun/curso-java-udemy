package application;
import java.util.Locale;
import java.util.Scanner;
import entities.dadosPessoas;
/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/
public class Program {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		 
		int qtddHomens=0, qtddMulheres=0;
		
		System.out.print("Entre com o nro de pessoas que deseja inserir: ");
		int n = sc.nextInt();
		
		dadosPessoas []vetDados = new dadosPessoas[n]; 
		
		for (int i = 0; i < vetDados.length; i++) {
			double altura;
			char genero; 
			
			System.out.printf("Entre com a altura da %da pessoa: ", i);
			altura = sc.nextDouble();
			System.out.printf("Entre com o genero da %da pessoa: ", i);
			genero = sc.next().charAt(0); 
			vetDados[i] = new dadosPessoas(altura, genero); 
		}
		
		double sum = 0.0, menor = vetDados[0].getAltura(), maior = vetDados[0].getAltura(), media = 0;
		for (int i = 0; i < vetDados.length; i++) {
			  if (vetDados[i].getAltura()<menor) {
				  menor = vetDados[i].getAltura(); 
			  }
			  if (vetDados[i].getAltura()>maior) {
				  maior = vetDados[i].getAltura(); 
			  }
			  if (vetDados[i].getGenero() == 'M') {
				  qtddHomens++;
			  }
			  if (vetDados[i].getGenero() == 'F') {
				  sum+=vetDados[i].getAltura();
				  qtddMulheres++;
			  }
		}
		media = sum/qtddMulheres;
		System.out.printf("Menor altura: %.2f\nMaior altura: %.2f\nMedia altura das mulheres: %.2f\nNumero de homens: %d", menor, maior, media, qtddHomens);
		sc.close();
	}

}
