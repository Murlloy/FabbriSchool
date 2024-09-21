package aula6;

public class TesteComConstrutor {

	public static void main(String[] args) {
		
		ContaComConstrutor conta1 = new ContaComConstrutor("Professor Pardal");
		ContaComConstrutor conta2 = new ContaComConstrutor("Lampadinha");
		
		System.out.println(conta1.getNome());
		System.out.println(conta2.getNome());
		
		
		
	}

}
