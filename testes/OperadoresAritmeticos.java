package testes;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1,n2;
		
		System.out.println("Escreva o primeiro valor: ");
		n1 = ler.nextFloat();
		
		System.out.println("Escreva um segundo valor: ");
		n2 = ler.nextFloat();
		
		float soma = n1 + n2;
		float menos = n1 - n2;
		float divisao = n1 / n2;
		int resto = (int) (n1 % n2);
		float multiplicacao = n1 * n2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Divisão: " + divisao);
		System.out.println("Resto: " + resto);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Subtração: " + menos);
		
		ler.close();
	}

}
