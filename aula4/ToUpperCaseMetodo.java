package aula4;

import java.util.Scanner;

public class ToUpperCaseMetodo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		
		System.out.println("Frase em Maiuscula: " + frase.toUpperCase());
		System.out.println("Frase em Minuscula: " + frase.toLowerCase());
		
		System.out.println("Fim...");
		ler.close();
	}

}
