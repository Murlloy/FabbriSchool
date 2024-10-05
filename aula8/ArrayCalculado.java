package aula8;

public class ArrayCalculado {

	public static void main(String[] args) {
		
		final int TAMANHO_ARRAY = 10;
		int[] novoArray = new int[TAMANHO_ARRAY];
		
		System.out.printf("%s%2s%6s%n", "Indice","|", "Valor");
		
		for(int i = 0; i < novoArray.length; i++) {
			System.out.printf("%4d%4s%4d%n", i,"|", novoArray[i]);
		}

	}
}
