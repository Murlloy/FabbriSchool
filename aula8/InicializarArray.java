// Classe para mostrar o valor padrão do elemento do array

package aula8;

import javax.swing.JOptionPane;

public class InicializarArray {
	
	public void Mouse() {
		JOptionPane.showMessageDialog(null, "Olá mundo");
	}

	public static void main(String[] args) {
		
		InicializarArray array = new InicializarArray();
		array.Mouse();
		
		int[] lista = new int[10];
		
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		for (int i = 0; i < lista.length; i++) {
			System.out.printf("%5d%8d%n", i, lista[i]);
		}
		
	}
	
}
