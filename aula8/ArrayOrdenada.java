package aula8;

import java.util.Arrays;

public class ArrayOrdenada {

	public static void main(String[] args) {
		
		String[] nomes = {"Lucas", "Pedro", "Sarah", "Sarah", "Sarah", "Sarah", "Sarah", "A Sarah", "B Sarah", "Sarah", "Sarah", "Sarah"};
		char[] vogais = {'i', 'u', 'a', 'e', 'o'};
		int[] numeros = {9, 2 , 6, 7, 5, 3, 4, 8, 1, 0};
		float[] notas = {5.6f, 7.4f , 5.4f , 5.9f , 9.0f , 2.0f , 1.5f , 45.8f};
		
		Arrays.sort(nomes);
		System.out.print("\nNomes: ");
		
		for(String nome: nomes) {
			System.out.print(nome + " , ");
		}
		
		Arrays.sort(vogais);
		System.out.print("\nVogais: ");
		
		for(char vogal: vogais) {
			System.out.print(vogal + " , ");
		}
		
		Arrays.sort(numeros);
		System.out.print("\nNumeros: ");
		
		for(int numero: numeros) {
			System.out.print(numero + " , ");
		}
		
		Arrays.sort(notas);
		System.out.print("\nNotas: ");
		
		for(float nota: notas) {
			System.out.print(nota + " , ");
		}
		

	}

}
