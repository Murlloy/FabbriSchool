package aula7;

public class UsaEmpregado {

	public static void main(String[] args) {
		
		Empregado trabalhador = new Empregado();
		
		trabalhador.setNome("Venus");
		trabalhador.setCartao("12345678");
		trabalhador.setRg("345123772");
		
		System.out.println(trabalhador.getNome());
		System.out.println(trabalhador.getCartao());
		System.out.println(trabalhador.getRg());

	}

}
