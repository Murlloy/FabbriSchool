package aula2;

public class SaidaFormatada {

	public static void main(String[] args) {
		// Definição de Variaveis
		
		
		String nome = "Murillo", alien = "Mestre Yoda";    // Definição da String Nome
		float nota = 9.6f;  								// Definir e inicializar a variavel
	    
		// Processamento e Saida
		System.out.println("Sua nota é: " + nota);  		// Concatenação
		
		// Uma outra Maneira (MEMA BOSTA) só não pula linha.
		System.out.print("Sua nota é: " + nota);
		
		// Um Exemplo de saida formatada:
		System.out.printf("\nA sua nota é: %.2f", nota);
		
		// MAIS UMA MANEIRA
		System.out.format("\nA sua nota é : %.2f", nota);
		
		// mais uma maneira de saida de variavel
		System.out.printf("\nA nota de %s é %.2f", nome, nota);
		
		// Saida no
		
		System.out.println(alien);
	}

}
