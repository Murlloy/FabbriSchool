package aula7;

public class UsaCamisa {

	public static void main(String[] args) {
		
		Camisa insider = new Camisa("Insider",   10, 120);
		
		System.out.println(insider.getClass().getSimpleName());
		System.out.println(insider.getClass());
		System.out.println(insider.hashCode());


	}

}
