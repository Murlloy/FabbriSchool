package aula7;

import javax.swing.JOptionPane;

public class PessoaComMuitasFormas {
	
	public static void main (String[]args) {
		
		Pessoa pessoa = null;
		
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Escolha entre: "
		+ "\n[1] - Pessoa Fisica" + "\n[2] - Pessoa Juridica" + "\n[3] - Empregado" +
		"\n[4] - Desempregado"));
		
		switch(tipo) {
		
		case 1:
			pessoa = new PessoaFisica(); break;
		case 2:
			pessoa = new PessoaJuridica(); break;
		case 3:
			pessoa = new Empregado();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Vai trabalhar!!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Numero Errado!!");
			System.exit(0);
		}
		
		pessoa.mostraClasse();
		
	}
}
