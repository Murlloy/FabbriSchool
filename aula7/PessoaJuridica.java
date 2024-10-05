package aula7;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj(){return this.cnpj;}
	
	public void mostraClasse() {
		System.out.println("Classe Pessoa Juridica");
	}
}
