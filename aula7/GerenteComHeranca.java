package aula7;

public class GerenteComHeranca extends Funcionario {
	
	private int senha;
	private int funcionarios;
	
	public int getSenha() {return this.senha;}
	public void setSenha(int senha) {this.senha = senha;}
	
	public int getFuncionarios() {return this.funcionarios;}
	public void setFuncionarios(int funcionarios) {this.funcionarios = funcionarios;}
	
	public boolean autentica(int senha) {
		if(senha == this.senha) {
			System.out.println("Senha Correta!");
			return true;
		}else {
			System.out.println("Senha incorreta!");
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
	}
	
	
}
