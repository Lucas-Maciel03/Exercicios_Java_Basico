package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
		double valorPeca1, valorPeca2, valorFinal;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorFinal = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);
		
		System.out.printf("Valor a Pagar: R$ %.2f", valorFinal);
		
		sc.close();
	}

}
