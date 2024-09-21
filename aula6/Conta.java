package aula6;

public class Conta {
	int numero;
	String titular;
	double saldo, limite;
	
	boolean sacar(double quantidade){//criar uma função de sacar.
		
		if(quantidade < 0) {
			System.out.println("Não tem como sacar numero negativo!!");
			return false;
		}else if(this.saldo < quantidade && quantidade < this.limite) {
			System.out.println("Saldo Insuficiente!");
			return false;
		}else if(quantidade > limite){
			System.out.println("Limite Insuficiente!");
			return false;
		}else{
			this.saldo -= quantidade;
			System.out.println("Saque Realizado com Sucesso!!");
			return true;
		}
			
	}
	
	void depositar(double quantidade) {
		if(quantidade < 0) {
			System.out.println("Não tem como adicionar numero negativo!!");
		}else {
			this.saldo += quantidade;
			System.out.println("\nDeposito Realizado com Sucesso!!");
		}
	}
	
	void transferir(Conta destino, double valor) {
			if(valor < 0)
				System.out.println("\nNão tem como trasferir dinheiro negativo!!");
		else if(valor > this.saldo) {
			System.out.println("\nNão tem como Transferir oque você não tem!!");
		}else if(valor > this.limite)
			System.out.println("\nLimite Atingido!!");
		else{
			this.saldo -= valor;
			destino.saldo += valor;
		}
	}
	
	
	
}
