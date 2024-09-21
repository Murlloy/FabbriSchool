package aula3;

import java.util.Scanner;

public class TesteComOu {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int loop = 1;
		
		System.out.println("Sistema inicializando....");
		
		do {
			
		
		System.out.println("Digite o codigo de acesso:");
		int codigo = ler.nextInt();

		boolean i = (codigo >= 1 && codigo <= 3)?true:false;
		
		
		if(i) {
			
			System.out.println("\nBem vindo ao programa!!");
			
			if(codigo == 1)
				System.out.println("\nONE PLAYER");
			if(codigo == 2)
				System.out.println("\nTWO PLAYER");
			if(codigo == 3)
				System.out.println("\nTHREE PLAYER");
			
			loop = 2;
			
			
		} else
			System.out.println("Codigo inserido é invalido!!");
		
		
		}while(loop == 1);
		
		ler.close();
	}
		
}
