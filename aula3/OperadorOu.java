package aula3;

import java.util.Scanner;

public class OperadorOu {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		// Declaração das variaveis
		
		int a,b,c,d,x,y,h;
		
		// y - x
		// a * b = x
		// c * d = y
		
		// Entrada
		
		System.out.print("A: ");
		a = ler.nextInt();
		
		System.out.print("B: ");
		b = ler.nextInt();
		
		System.out.print("C: ");
		c = ler.nextInt();
		
		System.out.print("D: ");
		d = ler.nextInt();
		
		//Processamento
		
		x = a * b;
		y = c * d;
		h = x - y;
		
		// Saida
		
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		
		System.out.printf("\nA subtração de %d e %d é: %d", x, y, h);
		
		ler.close();
		
	}

}
