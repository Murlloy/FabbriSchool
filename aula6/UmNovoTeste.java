package aula6;

public class UmNovoTeste {
	
	public static void main (String[] args) {
		
		double saldo;
		
		Conta outraconta = new Conta();
		
		outraconta.setSaldo(1000);
		
		double novoSaldo = -200;
		
		if(novoSaldo < 0)
				System.out.println("Não é possivel efetuar essa transação!");
		else {
			outraconta.setSaldo(novoSaldo);
		}
		
		System.out.println("O seu saldo é: " + outraconta.getSaldo());
	}
}
