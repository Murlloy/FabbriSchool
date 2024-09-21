package aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaLetraNaFrase {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String livro = "Livro Java 8 - Como Programar";
		
		ArrayList<String> livros = new ArrayList<>(); 
		
		livros.add("Comercio");
		livros.add("Java");
		livros.add("Sim");
		
		//indexOf retorna um numero inteiro - indice da primeira ocorrencia
		// caso não encontrar retorna o valor -1
		
		System.out.println(livros);
		System.out.println("Digite oque deseja busca: ");
		String busca = ler.nextLine();
		
		if(livros.indexOf(busca) == -1)
			System.out.println("não existe esse item!");
		else
			System.out.println("Item escolhido é o " + livros.indexOf(busca) + "º");

	}

}
