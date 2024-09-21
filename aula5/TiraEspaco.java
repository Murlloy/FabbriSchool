package aula5;

import java.util.Scanner;

public class TiraEspaco {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva uma frase com bastante espaços!");
		String frase = ler.nextLine();
		
		frase = "     " + frase + "     ";
		
		System.out.println("Frase Original: " + frase);
		System.out.println("Frase Modificada: " + frase.trim());

	}

}
