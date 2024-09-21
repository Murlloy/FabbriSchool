package aula4;

import java.util.Scanner;

public class Relogio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int minutos, horas, segundos;
		
		System.out.println("Escolha um horario para parar :D");
		System.out.println("Horas: ");
		int h = ler.nextInt();
		
		System.out.println("Minutos: ");
		int m = ler.nextInt();
		
		System.out.println("Segundos: ");
		int s = ler.nextInt();
		
		for(horas = 0; horas < 24; horas++) {
			// Horas
			
			
			for(minutos = 0; minutos < 60; minutos++) {
				// Minutos
				
				
				for(segundos = 0; segundos < 60; segundos++) {
					// Segundos
					
					System.out.println(horas + "h; " + minutos + "m; " + segundos + "s ");
					
					if(horas == h && minutos == m && segundos == s)
						System.exit(0);
					
				}
			}
		}
		
	}

}
