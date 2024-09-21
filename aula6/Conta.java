package aula6;

public class Conta {
	private int numero;
	private String titular;
	private double saldo, limite;
	
	public String getTitular(){return this.titular;}
	public double getSaldo(){return this.saldo;}
	public double getLimite(){return this.limite;}
	public int getNumero(){return this.numero;}
	
	public void setTitular(String titular) {this.titular = titular;}
	public void setSaldo(double saldo) {this.saldo = saldo;}
	public void setLimite(double limite) {this.limite = limite;}
	public void setNumero(int numero) {this.numero = numero;}
	
	
	public boolean sacar(double quantidade){//criar uma função de sacar.
		
		if(quantidade < 0) {
			System.out.println("\nNão tem como sacar numero negativo!!");
			return false;
		}else if(this.saldo < quantidade && quantidade < this.limite) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}else if(quantidade > limite){
			System.out.println("\nLimite Insuficiente!");
			return false;
		}else{
			this.saldo -= quantidade;
			System.out.println("\nSaque Realizado com Sucesso!!");
			return true;
		}
			
	}
	
	public boolean depositar(double quantidade) {
		if(quantidade < 0) {
			System.out.println("Não tem como adicionar numero negativo!!");
			return false;
		}else {
			this.saldo += quantidade;
			System.out.println("\nDeposito Realizado com Sucesso!!");
			return true;
		}
	}
	
	public boolean transferir(Conta destino, double valor) {
			if(valor < 0) {
				System.out.println("\nNão tem como trasferir dinheiro negativo!!");
				return false;
			}else if(valor > this.saldo) {
			System.out.println("\nNão tem como Transferir oque você não tem!!");
			return false;
		}else if(valor > this.limite) {
			System.out.println("\nLimite Atingido!!");
			return false;
		}else{
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
	}
	
	
	
}
