package exercicios_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class forExercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			double numerador = sc.nextDouble();
			double denominador = sc.nextDouble();
			
			if(denominador == 0) {
				System.out.println("Dividao Impossivel");
			} else {
				double resultado = numerador / denominador;
				System.out.printf("%.1f%n", resultado);
			}
		}
		
		sc.close();
	}

}
