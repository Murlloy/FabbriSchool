package aula7;

public class Empregado extends PessoaFisica{
	
	private String cartao;
	private double salario;
	private String profissao;
	
	
	public String getCartao() {return cartao;}
	public void setCartao(String cartao) {this.cartao = cartao;}
	
	public void mostraClasse() {
		System.out.println("Classe Empregado");
	}
	
	
	
}
