package aula7;

import java.util.Scanner;

public class TestaGerenteComHeranca {

	public static void main(String[] args) {
		
		GerenteComHeranca gerente = new GerenteComHeranca();
		Funcionario funcionario = new Funcionario();
		
		Scanner ler = new Scanner(System.in);
		
		funcionario.setSalario(1500);
		funcionario.setNome("Lalá");
		funcionario.setCpf(220000);
		
		gerente.setSenha(122);
		gerente.setNome("Murillo");
		gerente.setFuncionarios(100);
		gerente.setCpf(94509823);
		gerente.setSalario(5000);
		
		
		System.out.printf("O Gerente %s tem %d funcionarios \n", gerente.getNome(), gerente.getFuncionarios());
		System.out.print("Digite a senha do gerente: ");
		gerente.autentica(ler.nextInt());
		System.out.println("Sua bonificação é: " + gerente.getBonificacao());
		
		System.out.println("A bonificação do funcionario é: " + funcionario.getBonificacao());
		

	}

}
