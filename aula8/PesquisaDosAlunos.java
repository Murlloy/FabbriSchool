// Classe que analiza um pesquisa

package aula8;

public class PesquisaDosAlunos {

	public static void main(String[] args) {
		
		// array com as resposta dos alunos
		int[] notas = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
		int[] frequencia = new int[6];
		
		for(int resp = 0; resp < notas.length; resp++) {
		
			try {
				
				++frequencia[notas[resp]]; //Bloco que vai ter um erro, pois 14 é maior que o tamanho definido por ele
				
			}catch (ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				System.out.printf(" Respostas[%d] = %d%n%n", resp, notas[resp]);
			}
		}		
		
		System.out.print("Numero   Frequencia");
		
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("\n%4d%10d", i , frequencia[i]);
		}

	}

}
