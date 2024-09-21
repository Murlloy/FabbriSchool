package testes;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JavaJanela extends JFrame{
	
	private JTextArea texto = new JTextArea();
	
	public JavaJanela() {
		super("Batman.exe");
		this.montaJanela();
	}
	
	private void montaJanela() {
		this.getContentPane().add(texto);
	}
	
	public static void main(String[]args) {
		
		JavaJanela janela = new JavaJanela();
		janela.setVisible(true);
		janela.setSize(640,480);
	}
}