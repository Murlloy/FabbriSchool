package aula5;

import java.util.Scanner;
import java.util.Locale;

public class ArredondarParaBaixo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		
		System.out.print("Digite a sua nota: ");
		double nota = ler.nextDouble();
		
		System.out.println("Sua nota é: " + (int)Math.floor(nota));
		
		ler.close();
		
	}

}
