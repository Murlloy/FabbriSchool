package aula6;

public class OperacaoBancaria {

	public static void main(String[] args) {
		
		Conta destino = new Conta();
		Conta origem = new Conta();
		
		destino.setTitular("Tio Patinhas");
		destino.setNumero(001);
		destino.setSaldo(900000000);
		destino.setLimite(900000000);
		
		System.out.printf("o saldo da conta do %s tem: R$ %.2f", destino.getTitular(), destino.getSaldo());
		
		origem.setTitular("Darth Vader");
		origem.setNumero(002);
		origem.setSaldo(200);;
		origem.setLimite(100);
		
		destino.transferir(origem, 8000);
		
		System.out.println("\nSaldo da pessoa que você enviou: " + origem.getSaldo());
		
		

	}

}
