package aula8;

public class GraficoBarras {

	public static void main(String[] args) {
		// int[] arrayUm = {65, 60 , 54 ,53,123,90}
		// uma nota 100, 2 notas no intervalo 90, 4 notas no intervalo 80
		// 2 notas no intevalo de 70, uma nota no intervalo 60 e
		// nenhuma nota abaixo de 60
		
		int[] numeros = {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.println("Distribuições das notas");
		
		for(int i = 0; i < numeros.length; i++) {
			if(i == 10)
				System.out.printf("\n%5d: ", 100);
			else
				System.out.printf("\n%02d-%02d: ", i * 10, i * 10 + 9);
			
			// imprime os *
			for(int estrelas = 0; estrelas < numeros[i]; estrelas++) {
				System.out.printf("*");
			}
			
			
		}
		System.out.println("\nLista ---->");

	}

}
