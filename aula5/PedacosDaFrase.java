package aula5;

import java.util.Scanner;

public class PedacosDaFrase {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		
		System.out.println("Sua Frase: " + frase);
		System.out.println(frase.substring(2,5));
		

	}

}
