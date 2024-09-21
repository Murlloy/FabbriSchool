package aula6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NovoTesteDaContaDefinitiva {

	public static void main(String[] args) {
		
		ContaDefinitiva usuario = new ContaDefinitiva();
		
		/*
		Scanner ler = new Scanner(System.in);
		
		System.out.println(usuario.getNome());
		
		System.out.print("Digite um nome: ");
		usuario.setNome(ler.nextLine());
		
		System.out.println(usuario.getNome());
		*/
		
		JOptionPane.showMessageDialog(null, "Nome inicial: " + usuario.getNome());
		usuario.setNome(JOptionPane.showInputDialog("Digite um nome:"));
		JOptionPane.showMessageDialog(null, "O nome é: " + usuario.getNome());
		
		

	}

}
