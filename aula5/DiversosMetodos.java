package aula5;

public class DiversosMetodos {

	public static void main(String[] args) {
		
		double a = 2.4, b = 4.6, c = 4, d = 4.5;
		
		System.out.println("o numero arredondado de " + a + " é: " + (int)Math.round(a));
		System.out.println("o numero arredondado de " + b + " é: " + (int)Math.round(b));
		System.out.println("o numero arredondado de " + d + " é: " + (int)Math.round(d));
		
		System.out.println("O menor numero entre " + a + " e " + b + " é: " + Math.min(a, b));
		System.out.println("O Maior numero entre " + c + " e " + d + " é: " + Math.max(d, c));
		
		System.out.println("O Quadrado de "+ c + " é: " + Math.pow(a, 2));
		System.out.println("A raiz de " + c + " é: " + Math.sqrt(c));
		

	}

}
