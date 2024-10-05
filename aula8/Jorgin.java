package aula8;

public class Jorgin {
	
	void buscar(int tempo) {
		tempo += 90;
		System.out.println(tempo);
	}
	
	public static void main (String[] args) {
		Jorgin jorgin = new Jorgin();
		
		jorgin.buscar(10);
	}
}
