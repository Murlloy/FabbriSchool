package aula5;

import java.util.Scanner;

public class LetrasNaPalavra {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra: ");
		String palavra = ler.nextLine();
		int tamanho = palavra.length();
		
		
		System.out.println("Palavra: " + palavra);
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println("Letra " + i + " "  + palavra.charAt(i));
		}
		
		

	}

}
