package aula6;

public class OperacaoBancaria {

	public static void main(String[] args) {
		
		Conta destino = new Conta();
		Conta origem = new Conta();
		
		destino.titular = "Tio Patinhas";
		destino.numero = 001;
		destino.saldo = 1000000000;
		destino.limite = 1000000000;
		
		System.out.printf("o saldo da conta do %s tem: R$ %.2f", destino.titular, destino.saldo);
		
		origem.titular = "Darth Vader";
		origem.numero = 001;
		origem.saldo = 200;
		origem.limite = 100;
		
		origem.transferir(destino, 200);

	}

}
