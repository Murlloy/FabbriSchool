package aula5;

import java.util.Scanner;

public class TrocandoLetras {

	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite uma frase: ");
			String frase = ler.nextLine();
			
			System.out.println("Sua frase: " + frase);
			System.out.println(frase.replace(" " , ""));

	}

}
