package aula3;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		// Declaração da variavel tipo Scanner
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um number: ");
		double num  = ler.nextDouble();
		
		//System.out.println("Digite other number: ");
		//double num2 = ler.nextDouble();
		
		double potencia = Math.pow(num, num);
		
		System.out.println(potencia);
		
		ler.close();
		
	}

}
