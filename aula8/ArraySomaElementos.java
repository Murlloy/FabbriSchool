package aula8;

public class ArraySomaElementos {

	public static void main(String[] args) {
		
		int[] arrayUm = {10,90,30,4220,120,302,3};
		
		int total = 0;
		
		for(int i = 0; i < arrayUm.length; i++) {
			total += arrayUm[i];
		}
		
		System.out.println(total);
		
	}

}
