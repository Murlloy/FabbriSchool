package aula5;

import java.util.Random;
import java.util.Scanner;

public class SenhaAleatoria {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Random gerador = new Random();
		String senha = "";
		
		System.out.println("Criador de senhas Aleatorias");
		System.out.println("Escreva o numero maximo de letras que sua senha deverá ter");
		int max = ler.nextInt();
		
		for(int i = 0; i < max; i++) {
			int num = (int) (Math.random() * 10);
			senha += num;
		}
		
		System.out.println("Sua senha é: " + senha);
		
		System.out.println("Digite um numero de 1 a 10");
		int numero = ler.nextInt();
		
		int aleatorio = gerador.nextInt(11);
		
		if(aleatorio == numero)
			System.out.println("Você Ganhou!!");
		else
			System.out.println("Você perdeu!");
		
		System.out.println(aleatorio);
		

	}

}
