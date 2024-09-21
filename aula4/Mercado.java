package aula4;

import java.util.Locale;
import java.util.Scanner;

public class Mercado {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valor_total = 0, macarrao = 2.3, arroz = 4.1, feijao = 5.5;
		String produto;
		
		ler.useLocale(Locale.US);
		
		System.out.println("--- Bem vindo ao Carrinho de Compras 2000 ---");
		System.out.println("Lista: ");
		System.out.println(" - Feijão R$ 5,50");
		System.out.println(" - Arroz R$ 4,10");
		System.out.println(" - Macarrão R$ 2,30");
		System.out.println("Escreva o nome do produto que deseja" + "\n(feijao, arroz ou macarrao)");
		produto = ler.nextLine();
		
		if(produto.equals("feijao")) {
			valor_total += arroz;
		}else if(produto.equals("arroz"))
			valor_total += arroz;
		else if(produto.equals("macarrao"))
			valor_total += arroz;
		else
			System.out.println("Invalido!");
		
		
		
		System.out.println("O valor total da sua compra é");
		System.out.printf("R$ %.2f", valor_total);
		
		System.out.println("\nFim do programa.....");
		
		ler.close();
		
	}

}
