package application;
import java.util.Scanner; 
import java.util.Locale; 
import entities.aprovados;

/*Sistema Operacional: Windows 10
T�pico: Array
Compilador: Eclipse
Data: 29/12/2022
Nome: Carla Cavalcante 
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */

public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Entre com a quantidade de alunos que deseja inserir: ");
		int n = sc.nextInt(); 
		
		aprovados [] alunos = new aprovados [n];
		
		for (int i = 0; i < alunos.length; i++) {
			String nome;
			double nota1, nota2;
		
			System.out.print("Entre com o nome: ");
			sc.nextLine();
			nome = sc.nextLine(); 
			System.out.print("Entre com a nota1: ");
			nota1 = sc.nextDouble(); 
			System.out.print("Entre com a nota2: ");
			nota2 = sc.nextDouble(); 
			
			alunos[i] = new aprovados (nome, nota1, nota2); 
			
		}
		
		for (int i = 0; i < alunos.length; i++) {
			 double media = (alunos[i].getNota1() + alunos[i].getNota2())/2; 
			if (media >= 6.0)
				System.out.print(alunos[i].getNome());
		}
		
		
		sc.close();
	}
}
