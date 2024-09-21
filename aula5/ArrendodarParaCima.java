package aula5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrendodarParaCima {

	public static void main(String[] args) {
		
		
		final float LOTACAO_ONIBUS = 50;
		
		Scanner ler = new Scanner(System.in);
		
		int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Escreva o numero de pessoas: "));
		
		float qtdeOnibus = pessoas / LOTACAO_ONIBUS;
		
		JOptionPane.showMessageDialog(null, "A quantidade necessaria de onibus é: " + (int)Math.ceil(qtdeOnibus));
		
		
		
		/*
		
		System.out.println("Quantas pessoas vão embarcar?");
		int pessoas = ler.nextInt();
			
		if(pessoas == LOTACAO_ONIBUS) {
			
			System.out.println("Por Sorte todos entraram apenas em um onibus.");
			
		}else if(pessoas > LOTACAO_ONIBUS) {
			System.out.println("Infelizmente não poderá ir todo mundo no mesmo onibus");
			
			onibus = pessoas / LOTACAO_ONIBUS;
			
			System.out.println("Vai ser necessario: " + (int)Math.ceil(onibus) + " onibus");
			
		}else if(pessoas <= 0)
				System.out.println("Não tem como viajar com nenhuma pessoa!!");
		else
				System.out.println("Boa viagem!! apenas um onibus necessario");
		
		ler.close();
		*/

	}

}
