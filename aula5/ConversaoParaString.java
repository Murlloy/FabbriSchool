package aula5;

import java.util.Scanner;

public class ConversaoParaString {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int n = ler.nextInt();
		
		int a = 1000;
		int b = 2900;
		int c = 1111;
		
		String texto = String.valueOf(a) + " " + String.valueOf(b);
		System.out.println(texto);

	}

}
