package aula7;

public class PessoaFisica extends Pessoa{
	
	private String rg;
	private String cpf;
	
	public String getRg() {return rg;}
	public void setRg(String rg) {this.rg = rg;}
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {this.cpf = cpf;}
	
	public void mostraClasse() {
		System.out.println("Classe Pessoa Fisica");
	}
	
}
