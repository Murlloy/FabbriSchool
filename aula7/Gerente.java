package aula7;

public class Gerente {
	
	private String nome;
	private int cpf;
	private double salario;
	private int senha;
	private int funcionarios;
	
	
	public String getNome() {return this.nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	public int getCpf() {return this.cpf;}
	public void setCpf(int cpf) {this.cpf = cpf;}
	
	public double getSalario() {return this.salario;}
	public void setSalario(double salario) {this.salario = salario;}
	
	public int getSenha() {return this.senha;}
	public void setSenha(int senha) {this.senha = senha;}
	
	public int getFuncionarios() {return this.funcionarios;}
	public void setFuncionarios(int funcionarios) {this.funcionarios = funcionarios;}
	
	public boolean autentica(int senha) {
		if(senha == this.senha) {
			System.out.println("Senha Correta!");
			return true;
		}else
			return false;
	}
	
}
