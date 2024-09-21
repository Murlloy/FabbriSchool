package aula5;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConfiguracoesRegionais {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		Scanner ler = new Scanner(System.in);
		Locale local = Locale.getDefault();
		ler.useLocale(Locale.US);
		
		System.out.print("Digite um valor de dinheiro: ");
		double dinheiro = ler.nextDouble();
		
		if(local.getCountry().equals("BR")) {
			System.out.println("Seu teclado é PT-BR");
		}else
			System.out.println("Seu teclado é Algum que não é PtBR");
		
		df.applyPattern("R$ ##,##0,000.00");
		System.out.println(df.format(dinheiro));
		
		System.out.println("Seu sistema operacional: " + local.getCountry());
		System.out.println("Sua linguagem é: " + local.getDisplayLanguage());
		
		
		

	}

}
