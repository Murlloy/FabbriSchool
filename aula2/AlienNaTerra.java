package aula2;

public class AlienNaTerra {

	public static void main(String[] args) {
		
		// Criação das Variaveis
		
		String local, alien, escola, inferiores;
		local = "Santo Amaro";
		escola = "Senai";
		alien = "Mestre Yoda";
		inferiores = "Humanos";
		
		// Processamento e Saida
		
		System.out.printf("O %s chegou em %s e andou até o %s", alien, local, escola);
		System.out.printf("\nNo %s, ele mandou uma mensagem.", escola);
		System.out.printf("\nMensagem de %s para %s", alien, inferiores);
		System.out.println(" ");
		
		System.out.println("\nMensagem sendo descriptografada...");                    
		
		System.out.println(" ");
		
		System.out.printf("Olá, %s aqui! Que a força esteja com você!!", alien, escola);
		System.out.println("\n\\o/");
		System.out.println("\nFim da Transmissão.......");
	}

}
