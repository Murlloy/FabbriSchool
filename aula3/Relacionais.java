package aula3;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		
		//Declaração das variaveis
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero");
		int n1 = ler.nextInt();
		
		System.out.println("Escreva o segundo numero");
		int n2 = ler.nextInt();
		
		// Processamento
		
		boolean igualdade = (n1 == n2);                     	// n1 é igual a n2???
		boolean maior = (n1 > n2);								// n1 maior que n2???
		boolean menor = (n1 < n2);                             
		boolean diferente = (n1 != n2);
		boolean maiorigual = (n1 >= n2);
		boolean menorigual = (n1 <= n2);
		
		//Saida
		
		System.out.printf("Igualdade entre %d == %d resulta em %b\n", n1, n2, igualdade);
		System.out.printf("Maio entre %d > %d resulta em %b\n", n1, n2, maior);
		System.out.printf("Menor entre %d < %d resulta em %b\n", n1, n2, menor);
		System.out.printf("Diferente entre %d != %d resulta em %b\n", n1, n2, diferente);
		System.out.printf("Maior ou Igual entre %d >= %d resulta em %b\n", n1, n2, maiorigual);
		System.out.printf("Menor ou Igual entre %d <= %d resulta em %b\n", n1, n2, menorigual);
		
		ler.close();
		
	}

}
