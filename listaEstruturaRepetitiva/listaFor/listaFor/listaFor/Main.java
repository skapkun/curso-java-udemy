package listaFor;
import java.util.Locale;
import java.util.Scanner; 


/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - For 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso. 
public class Main {
public static void main (String [] args) { 
	Scanner sc = new Scanner (System.in); 
	int x, aux; 
	
	System.out.print("Entre com um numero: ");
	x = sc.nextInt(); 
	
	for (int i = 1; i <= x; i++) {
		if (i % 2 != 0) 
			System.out.printf("\n%d", i); 
		}
	 sc.close();  
}
}*/
/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - For 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). 
 
public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in); 
		Locale.setDefault(Locale.US);
		
		int in = 0, out = 0, n, x; 
		System.out.print("Entre com a quantidade de valores que deseja inserir: ");
		n = sc.nextInt(); 
		
		for (int i = 0; i<n; i++) {
			System.out.print("Entre com um numero: ");
			x = sc.nextInt(); 
			
			if (x >= 10 && x <= 20)
				in++; 
			else
				out++; 
			
		}
		System.out.printf("\nin: %d\nout: %d", in, out);
		
		sc.close();
	}
}*/

/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - For 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5. 
public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in); 
		Locale.setDefault(Locale.US);
		
		int n;
		float valorA, valorB, valorC, resul;
		
		System.out.print("Entre com o numero de casos de testes que deseja realizar: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Entre com o primeiro valor: ");
			valorA = sc.nextFloat();
			System.out.println("Entre com o primeiro valor: ");
			valorB = sc.nextFloat();
			System.out.println("Entre com o primeiro valor: ");
			valorC = sc.nextFloat();
			
			resul = ((valorA*2) + (valorB*3)+ (valorC*5))/10;
			System.out.printf("%.1f", resul);
		
		}
		
		sc.close(); 
	}
} */

/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - For 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel" 

public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in); 
		Locale.setDefault(Locale.US);
		
		int n, numerador, denominador; 
		float div; 
		System.out.print("Entre com a quantidade de divisões que deseja realizar: ");
		n = sc.nextInt(); 
		
		for (int i = 0; i < n; i ++) {
			System.out.println("Entre com o numerador: ");
			numerador = sc.nextInt(); 
			System.out.println("Entre com o denominador: ");
			denominador = sc.nextInt(); 
			
			if (denominador == 0) {
				System.out.println("divisao impossivel");
			}
			else { 
				div = (float) numerador/denominador;
			System.out.printf("%.1f\n", div);
			}
		}
		
		sc.close();
	}
}*/

/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - For 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 
public class Main {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in); 
		
		int n; 
		
		System.out.print("Entre com um numero: ");
		n = sc.nextInt(); //supondo que entrei com 4
		int aux = n; //auxiliar agora eh 4 
		
		for (int i = n -1 ; i != 1; i--) { //começa de 4, vai diminuindo e para no 1 
			 
			aux = aux*i; 
			
			
		}
		
		System.out.printf("\n%d", aux);
		
		sc.close(); 
	}
}*/

/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - For 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Ler um número inteiro N e calcular todos os seus divisores.
 

public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in); 
		int n; 
		
		System.out.print("Entre com um numero: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) 
				System.out.printf("\n%d", i);
			
		}
		
		
		sc.close(); 
	}
} */

/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - For 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
		int n = sc.nextInt();
		
		for (int i= 1; i <= n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}
}
 