package aula5;

import java.text.DecimalFormat;

public class FormataNumero {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		
		short idade = 39;
		
		df.applyPattern("000");
		
		System.out.println("O numero requerido é: " + df.format(idade));
		
		int qnt = 10000;
		
		df.applyPattern("#00,000");
		System.out.println("Isso ai: " + df.format(qnt));
		
		long estoque = 4197764;
		df.applyPattern("#,##0,000");
		System.out.println(df.format(estoque));
		
		int dinheiro = 1000000;
		df.applyPattern("R$ #,##0,000.00");
		System.out.println(df.format(dinheiro));

	}

}
