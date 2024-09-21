package aula2;

import java.util.Scanner;										// Importar a biblioteca Scanner.

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);    				//Criação do nome do novo Scanner
		
		System.out.println("Qual o nome do alien: ");			//Entrada de Informação para a variavel nome
		String nome = ler.nextLine();							
		
		System.out.println("Digite a nota do alien: "); 		//Entrada de Informação para a variavel nome
		float nota = ler.nextFloat();
		
		System.out.printf("A nota do alien %s é %.1f \n", nome, nota);	//Concatenação de mascaras
		
		ler.close();
	}

}
