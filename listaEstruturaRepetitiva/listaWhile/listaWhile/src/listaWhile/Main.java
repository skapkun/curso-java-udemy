package listaWhile;
import java.util.Scanner;

/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - While 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002..

public class Main {
	public static void main (String [] args) { 
		Scanner sc = new Scanner (System.in); 
		
		int senha;
		System.out.print("Entre com a senha: ");
		senha = sc.nextInt();
		
	while (senha != 2002) {
			 
			System.out.print("\nSenha inválida! Tente novamente: ");	
			senha = sc.nextInt();
	}
		System.out.print("\nAcesso Permitido!");
		sc.close();
	}
}*/

/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - While 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in); 
		
		int x, y; 
		System.out.print ("Entre com a coordenada X: "); 
		x = sc.nextInt(); 
		System.out.print("Entre com a coordenada Y: ");
		y = sc.nextInt(); 
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) 
				System.out.print("Primeiro quadrante!");
			else if (x > 0 && y < 0)
				System.out.print("Quarto quadrante!");
			else if (x < 0 && y < 0)
				System.out.print("Terceiro quadrante!");
			else if (x < 0 && y > 0)
				System.out.print("Segundo quadrante!");
			
			System.out.print ("\nEntre com a coordenada X: "); 
			x = sc.nextInt(); 
			System.out.print("Entre com a coordenada Y: ");
			y = sc.nextInt();
				
		}
		
		sc.close(); 
	}
}*/



/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - While 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo..*/

public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in); 
		int cod, alcool=0, gasolina=0, diesel=0; 
		
		System.out.print("Entre com o codigo: ");
		cod = sc.nextInt(); 
		
		while (cod != 4) {
			  
			
			if (cod == 1)
				alcool++; 
			else if (cod == 2)
				gasolina++; 
			else if (cod == 3)
				diesel++; 
			
			
			System.out.print("Entre com o codigo: ");
			cod = sc.nextInt(); 
	 	
			}
		System.out.printf ("\nMUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel); 
		
		sc.close(); 
	}
}