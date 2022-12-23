package listaEstruturaCondicional;

import java.util.Scanner;

/*Sistema Operacional: Windows 10
Topico: Estrutura Condicional
Compilador: Eclipse
Data: 23/12/2022
Nome: Carla Cavalcante 
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		int num; 
		System.out.println ("Entre com um numero: "); 
		num = sc.nextInt(); 
		
		if (num > 0)
			System.out.println("Eh positivo!");
			else 
				System.out.println("Eh negativo!"); 
		
		sc.close(); 
	
	}
}*/

/*Sistema Operacional: Windows 10
Topico: Estrutura Condicional
Compilador: Eclipse
Data: 23/12/2022
Nome: Carla Cavalcante 
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class Main { 
	public static void main (String[]args) { 
		Scanner sc = new Scanner (System.in); 
		int num; 
		System.out.print("Entre com um numero: "); 
		num = sc.nextInt(); 
		
		if (num % 2 == 0)
			System.out.println ("Eh par!"); 
		else 
			System.out.println ("Eh impar!"); 
		
		
		sc.close(); 
	}
}*/

/*Sistema Operacional: Windows 10
Topico: Estrutura Condicional
Compilador: Eclipse
Data: 23/12/2022
Nome: Carla Cavalcante 
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

public class Main { 
	public static void main (String [] args) { 
		Scanner sc = new Scanner (System.in); 
		
		int numA, numB; 
		
		System.out.print("Entre com o primeiro valor: "); 
		numA = sc.nextInt(); 
		System.out.print("Entre com o segundo valor: ");
		numB = sc.nextInt(); 
		
		
		if (numA % numB == 0 || numB % numA == 0)
			System.out.print ("Sao multiplos!"); 
		else 
			System.out.print("Nao sao multiplos!");
		
		
		sc.close(); 
	}
}*/
/*Sistema Operacional: Windows 10
Topico: Estrutura Condicional
Compilador: Eclipse
Data: 23/12/2022
Nome: Carla Cavalcante 
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas

 public class Main { 
	 public static void main (String[] args) {
		 Scanner sc = new Scanner (System.in); 
		 int horaInicial, horaFinal, duracao; 
		 
		 System.out.print("Entre com a hora inicial do jogo: ");
		 horaInicial = sc.nextInt(); 
		 System.out.print("Entre com a hora final do jogo: ");
		 horaFinal = sc.nextInt(); 
		 
		 if (horaInicial < horaFinal) 
			 duracao = horaFinal - horaInicial ; 
		 else 
			 duracao = 24 - horaInicial + horaFinal;
		 
		 System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		 
		 sc.close();
	 }
 }*/

/*Sistema Operacional: Windows 10
Topico: Estrutura Condicional
Compilador: Eclipse
Data: 23/12/2022
Nome: Carla Cavalcante 
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 
public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in); 
		
		int cod, qtd;
		double total=0; 
		
		System.out.print("Entre com o codigo: ");
		cod = sc.nextInt(); 
		System.out.print("Entre com a quantidade do item desejado: ");
		qtd = sc.nextInt(); 
		
		if (cod == 1)
		{
			total = qtd*4.00;
			}
			else if (cod == 2)
				total = qtd*4.50; 
			else if (cod == 3)
				total = qtd*5.00; 
			else if (cod == 4)
				total = qtd * 2.00; 
			else if (cod == 5)
				total = qtd * 1.50; 
			else 
				System.out.println("Codigo invalido!!"); 
		
		System.out.printf ("Total: R$ %.2f", total); 
		
		sc.close();
	}
} */

/*Sistema Operacional: Windows 10
Topico: Estrutura Condicional
Compilador: Eclipse
Data: 23/12/2022
Nome: Carla Cavalcante 
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

 public class Main {
	 public static void main (String [] args) {
		 Scanner sc = new Scanner (System.in); 
		 double valor; 
		 
		 System.out.print("Entre com um valor: ");
		 valor = sc.nextDouble(); 
		 
		 if (valor >= 0 && valor <=25.00)
			 System.out.println ("Intervalo [0,25]"); 
		 else if (valor > 25.00 && valor <= 50.00)
			 System.out.println ("Intervalo [25,50]"); 
		 else if (valor >50.00 && valor <= 75.00)
			 System.out.println ("Intervalo [50,75]"); 
		 else if (valor > 75.00 && valor <=100.00)
			 System.out.println ("Intervalo [75,100]"); 
		 else 
			 System.out.println ("Fora de intervalo");
		 
		 
		 
		 sc.close(); 
	 }
 }*/

/*Sistema Operacional: Windows 10
Topico: Estrutura Condicional
Compilador: Eclipse
Data: 23/12/2022
Nome: Carla Cavalcante 
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.

public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in); 
		float x, y; 
		
		System.out.print("Entre com o valor de x: ");
		x = sc.nextFloat();
		System.out.print("Entre com o valor de y: ");
		y = sc.nextFloat(); 
		
		if (x == 0 && y == 0)
			System.out.println ("Eixo!"); 
		else if (x > 0 && y > 0 )
			System.out.println ("Q1"); 
		else if (x < 0 && y > 0)
			System.out.println ("Q2"); 
		else if (x < 0 && y < 0)
			System.out.println ("Q3"); 
		else if (x > 0 && y < 0)
			System.out.println ("Q4"); 
		
		
		sc.close(); 
	}
}*/

/*Sistema Operacional: Windows 10
Topico: Estrutura Condicional
Compilador: Eclipse
Data: 23/12/2022
Nome: Carla Cavalcante 
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
*/
 public class Main {
	 public static void main (String [] args) {
		 Scanner sc = new Scanner (System.in); 
		 double sal, imposto; 
		 
		 System.out.print("Entre com o salario: ");
		 sal = sc.nextDouble(); 
		 
		 if (sal <= 2000.00) {
			imposto = 0.0;
		 }
		 else if (sal <= 3000.00) {
				imposto = (sal - 2000.0) * 0.08;

		 }
		 else if (sal <= 4500.0) {
				imposto = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
			}
			else {
				imposto = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			}
		 
		 if (imposto == 0.0) {
				System.out.println("Isento");
			}
			else {
				System.out.printf("R$ %.2f%n", imposto);
			}

			 
		 
		 sc.close(); 
	 }
 }