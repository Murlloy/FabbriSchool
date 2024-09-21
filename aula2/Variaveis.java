package aula2;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o valor de A");
		a = ler.nextDouble();
		
		//c = a;
		 
		System.out.println("Digite o valor de B");
		b = ler.nextDouble();
		
		//a = b;
		//b = c;
		
		System.out.println("A = " + b);
		
		System.out.println("B = "+ a);
		
		ler.close();

	}

}
