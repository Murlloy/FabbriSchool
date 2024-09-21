package aula5;

import java.util.Scanner;

public class TamanhoDaFrase {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String frase;
		
		System.out.print("Digite uma Frase: ");
		frase = ler.nextLine();
		
		int tamanho = frase.length();
		
		System.out.println("Frase: " + frase + "\nTamanho da frase: " + tamanho);
		
		
		ler.close();
		
	}

}
