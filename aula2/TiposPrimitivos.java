package aula2;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Exemplo de tipos primitivos em java:
		
		char sexo = 'f';    						// Tipo primitivo char (caractere)
		byte idade = 20;    						// Tipo primitivo byte (numero)
		short codigo = 256;         				// Tipo primitivo short 
		float nota = 4.8f;							// Tipo primitivo float (numero real)
		int alunos = 100, classes = 20;             // Tipo primitivo int (numero inteiro)
		long moradores = 9050100;                   // Tipo primitivo long (numeros grandes)
		double dolar = 5.47;                        // Tipo primitivo double (numero real)
		boolean alternativa = false;                // Tipo primitivo boolean (numero booleano, falso ou real)
		
		//  Processamento e Saida de dados                      // Apresentação dos dados do individuo
																// Concatenação de variaveis à Strings
		System.out.println("Dados do Individuo: "); 											
		System.out.println("Sexo: " + sexo + "    Idade: " + idade + "    Codigo: " + codigo);     	
		System.out.println("Nota: " + nota + "    Alunos: " + alunos + "    Classes: " + classes); 
		System.out.println("Moradores: " + moradores + "    Preço do Dolar: " + dolar + "    Alternativa: " + alternativa);
	}

}
