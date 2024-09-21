package aula4;

import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		
		//Declaração das variaveis
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		String nome;
		
		System.out.println("Olá, Digite o seu Nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digite o seu peso: ");
		peso = ler.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.printf("O seu IMC é %.2f", imc);
		System.out.println("\nDados do paciente: " + nome);
		if(imc < 5)
			System.out.println("VAI CUMER !!!!");
		else if(imc > 5 && imc < 16.9)
			System.out.println("Muito abaixo do Peso!! Vai cume meu FI!!!");
		else if(imc >= 17 && imc <= 18.4)
			System.out.println("Abaixo do peso");
		else if(imc >= 18.5 && imc <= 24.9)
			System.out.println("Peso Normal");
		else if(imc >= 25 && imc <= 29.9)
			System.out.println("Acima do peso");
		else if(imc >= 30 && imc <= 34.5)
			System.out.println("Obesidade Grau 1");
		else if(imc >= 35 && imc <= 40)
			System.out.println("Obesidade Grau 2");
		else if(imc >= 40 && imc <= 45)
			System.out.println("Obesidade Grau 3");
		else
			System.out.println("MÃE DO RENAN");
		
		ler.close();
		
		
	}

}
