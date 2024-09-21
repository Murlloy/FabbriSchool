package aula3;

public class OperadorLogico {

	public static void main(String[] args) {
		
		int salario = 900;
		int idade = 19;
		String res;
		
		res = (salario > 1000) && (idade > 18)?"Aprovado":"Reprovado";
		
		System.out.println(res);
		
	}

}
