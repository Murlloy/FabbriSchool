package aula6;

import java.util.Scanner;

public class TesteDaConta {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double qnt;
		
		Conta destino;
		destino = new Conta();
		
		Conta minhaConta = new Conta();  //a variavel minhaConta tem as caracteristicas da classe Conta
												//adicona a variavel a memoria
		
		System.out.print("Digite um nome: ");
		minhaConta.setTitular(ler.nextLine());
		
		System.out.print("Digite o seu saldo: ");
		minhaConta.setSaldo(ler.nextDouble());
		
		System.out.print("Digite o seu limite: ");
		minhaConta.setLimite(ler.nextDouble());
		
		System.out.print("Digite o seu numero: ");
		minhaConta.setNumero(ler.nextInt());
		
		System.out.print("Informações do Usuario: " + "\nNome: "
		+ minhaConta.getTitular() + "\nNumero: " + minhaConta.getNumero() 
		+ "\nSaldo: R$" + minhaConta.getSaldo() + "\nLimite: R$" + minhaConta.getLimite());
		
		System.out.println("\nGostaria de:" + "\n[1] - Sacar" + "\n[2] - Depositar" + "\n[3] - Transferir");
		int esc = ler.nextInt();
		
		switch(esc) {
			case 1:
				System.out.print("Quanto deseja Sacar: ");
				qnt = ler.nextDouble();
				minhaConta.sacar(qnt);
			
				break;
			
			case 2:
				System.out.print("Quanto deseja Depositar: ");
				qnt = ler.nextDouble();
				minhaConta.depositar(qnt);
				
				break;
				
			case 3:
				System.out.println("Quanto deseja Transferir: ");
				qnt = ler.nextDouble();
				minhaConta.transferir(destino, qnt);
				
				System.out.println("Saldo da pessoa que você enviou: " + destino.getSaldo());
				
				break;
		
			default:
				System.out.println("Invalido!!");
				System.out.println("Seu saldo não mudou!6tf");
				break;
		}
		
		System.out.println("Saldo atual: " + minhaConta.getSaldo());
		
		
		

	}

}
