package aula5;

import java.util.Scanner;
import java.util.Random;

public class JogoDaSorte {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		
		for(int jogo = 1; jogo <= 5; jogo++) {
			String resultado = "";
		
			for(int i = 0; i < 6; i++) {
				int num = gerador.nextInt(61);
				resultado += " " + num;
			}
		
			System.out.println("Resultado da Mega sena: " + jogo + " " + resultado);
		
		}
		
		
		
	}

}
