package listaWhile;
import java.util.Scanner;

/*Sistema Operacional: Windows 10
T�pico: Estrutura Repetitiva - While 
Compilador: Eclipse
Data: 25/12/2022
Nome: Carla Cavalcante 
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002..*/

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
	

}
