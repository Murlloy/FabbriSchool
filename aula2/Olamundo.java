package aula2;

import java.util.*;

public class Olamundo {

	public static void main(String[] args) { // bloco principal do codigo "main"
		
		Scanner ler = new Scanner(System.in);
		int hora, min, pass, dia, mes, ano;
		dia = 0;
		mes = 0;
		ano = 0;
		
		System.out.println("Calculadora de Horas");
		do {
			System.out.println("Que horas são?");
			hora = ler.nextInt();
			
			if(hora > 23 || hora < 0) {
				System.out.println("Horario Inválido! (coloque um horário existente)");
				
			}
		} while(hora > 23 || hora < 0);
		
		do {
			System.out.println("Quantos minutos?");
			min = ler.nextInt();
			
			if(min > 60 || min < 0) {
				System.out.println("Horario Inválido! (coloque um horário existente)");
			}
		} while(min > 60 || min < 0);
		
		System.out.println("Quantos minutos se passaram?");
		pass = ler.nextInt();
		
		System.out.println("Dados:");
		System.out.println("Horario: " + hora + ":" + min);
		
		int hora2 = 0;
		int min2 = 0;
		
		do {
			if(min >= 60) {
				min = min - 60;
				
			} else
				min2 = pass;
			
		} while(min >= 60);
		
		do {
			if(pass >= 60) {
				pass = pass - 60;
				hora2 = hora2 + 1;
			} else
				min2 = pass;
			
		} while(pass >= 60);
		
		min = min2 + min;
		hora = hora + hora2;
				
		if(hora2 < 1) {
			System.out.println("Se passaram " + min2 + " minutos");
			
		} else if(hora2 > 1 || hora2 < 24)
			System.out.println("Se passaram " + hora2 + " horas e " + min2 + " minutos");
		
		if(hora >= 24) {
			do {
				hora = hora - 24;
				
			} while(hora > 24);
			
		}
		
		if(hora2 >= 24) {
			hora2 = hora2 - 24;
			dia = dia + 1;
		}
		
		if(dia < 30 && dia > 0) {
			System.out.println("se passaram " + dia + " dias");
		
	}
		if(dia > 30) {
			do {
				dia = dia - 30;
				mes = mes + 1;
				
			} while(dia > 30);
			
			if(mes < 12) {
				System.out.println("se passaram " + mes + " meses e " + dia + " dias");
			}
		}
		
		if(mes > 12) {
			do {
				mes = mes - 12;
				ano = ano + 1;
				
			} while(mes > 12);
			
			System.out.println("se passaram " + ano + " anos, " + mes + " meses e " + dia + " dias");
		}
		
		System.out.println("Novo Horario: " + hora + ":" +  min);
		
		ler.close();

}
}