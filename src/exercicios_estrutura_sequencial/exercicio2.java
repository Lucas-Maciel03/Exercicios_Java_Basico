package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double raio, area;
		
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}

}
