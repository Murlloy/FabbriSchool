package aula7;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class UmArrayDeNumeros {

	public static void main(String[] args) {
		
		int[] inteiros = new int[10];
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("000");
		
		for (int i = 0; i < inteiros.length; i++) {
			
			inteiros[i] = (int)(Math.random() * 1000);
			System.out.println(df.format(inteiros[i]));
			
		}
		

	}

}
