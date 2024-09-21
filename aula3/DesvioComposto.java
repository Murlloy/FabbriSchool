package aula3;

import java.util.Locale;
import java.util.Scanner;

public class DesvioComposto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		
		System.out.println("------------------------------");
		
		System.out.println("--- Bem vindo ao programa hiper secreto da NASA!! ---");
		System.out.println("  Esse é um programa exclusivo para marcianos.");
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Confirme que você não é Humano!!");
		
		System.out.println("Escreva novamente esse numero: 1098767");
		
		int codigo = ler.nextInt();
	
		
		if(codigo == 1098767) {
			
			System.out.println("OK.. OK.. você é um marciano!");
			System.out.println("------------------------------");
			System.out.println("Seja bem vindo viajante");
			System.out.println("Escolha um numero: ");
			
			double n = ler.nextDouble();
			
			System.out.println("------------------------------");
			
			if( n > 20 && n < 90) {
				System.out.println("Parabens!! Numero entre 20 e 90");
			} else
				System.out.println("O numero NÃO ESTÁ entre 20 e 90");
			
		} else {
			System.out.println("------------------------------");
			System.out.println("VOCÊ É HUMANO, SAIA!!!");
			System.out.println("------------------------------");
		}
		
		
		ler.close();
		
	}

}
