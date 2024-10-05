package aula8;

import java.util.Scanner;

public class CriaArrayC {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor para o tamanho da array (cuidado pois pode fazer um [loop] quase infinito!!)");
		int tamanho = ler.nextInt();
		
		int[] numeros = new int[tamanho];
		int soma = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um valor para o indice " + i);
			numeros[i] = ler.nextInt();
			
			if(i >= 0 && i < 3) {
				soma += numeros[i];
		    }else
				continue;
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("indice " + i + " : " + numeros[i]);
		}
		
		System.out.println("O valor da soma é: " + soma);
		
		if(numeros.length >= 8) {
			System.out.printf("A metade do indice 7 é: " + numeros[7]/2);
		}
		
		ler.close();

	}

}
