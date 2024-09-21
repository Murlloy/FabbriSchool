package aula4;

import java.util.Scanner;

public class QualMesComSwitcheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		String mes;
		
		System.out.println("Escreva um valor referente ao mês... um.. dois , tres");
		mes = ler.nextLine();
		
		switch(mes) {
		case "um": System.out.println("Janeiro");
		case "dois":System.out.println("Fevereiro"); break;
		case "tres":System.out.println("Março"); break;
		case "quatro":System.out.println("Abril"); break;
		case "cinco":System.out.println("Maio"); break;
		case "seis":System.out.println("Junho"); break;
		case "sete":System.out.println("Julho"); break;
		case "oito":System.out.println("Agosto"); break;
		case "nove":System.out.println("Setembro"); break;
		case "dez":System.out.println("Outubro"); break;
		case "onze":System.out.println("Novembro"); break;
		case "doze":System.out.println("Dezembro"); break;
		default:System.out.println("Numero Invalido");break;
			
		}
		
	}

}
