package aula4;

import java.util.Scanner;

public class PreTesteComWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int I, Resp = 1;
		
		System.out.println("Inicio do Programa!");
		
		while(Resp == 1) {
			
			System.out.println();
			
			I = 1;
			while( I <= 5 ) {
				System.out.printf("Valor: %d ", I);
				I++;
			}
			
			System.out.println();
			System.out.println("Deseja Continuar?");
			System.out.println("[1] - Sim, [2] - Não");
			Resp = ler.nextInt();
			
			
		}
		
		System.out.println("Fim do Programa!!");
		
		ler.close();
		
	}

}
