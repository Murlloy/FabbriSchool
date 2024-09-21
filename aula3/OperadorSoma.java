package aula3;

import java.util.Locale;
import java.util.Scanner;

public class OperadorSoma {

	public static void main(String[] args) {
		
		// Criação da variavel tipo Scanner
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		
		//Entrada com Declaração de Variaveis
		
		System.out.println("Operação de Adição:");
		System.out.print("Digite um number for me: ");
		
		float n1 = ler.nextFloat();
		
		System.out.print("Caro Alien, digite other number: ");
		float n2 = ler.nextFloat();
		
		// Processamento
		
		float soma = n1 + n2;
		
		// Saida do resultado da soma
		
		System.out.println("O resultado of " + n1 + " and " + n2 + " é " + soma);
		
		ler.close();
	}

}
