package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class estruturaDoWhile {

	public static void main(String[] args) {
		/*
		 * Na estruturado while o bloco de codigo executa pelo menos uma vez.
		 * executa uma vez e testa se a condição é verdadeira no final.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
	}

}
