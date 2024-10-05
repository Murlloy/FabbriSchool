package aula8;

public class CriaArrayComInicializador {

	public static void main(String[] args) {
		
		int[] numeros = { 90 , 89 , 230 , 12 };
		
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("%5d%8d%n", i, numeros[i]);
		}

	}

}
