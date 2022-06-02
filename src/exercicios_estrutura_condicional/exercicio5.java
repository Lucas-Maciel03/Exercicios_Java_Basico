package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double precoFinal = 0;
		
		System.out.println("Digite codigo do produto: ");
		int codigo = sc.nextInt();
		
		System.out.println("Digite quantidade: ");
		int qtd = sc.nextInt();
		
		if(codigo == 1) {
			precoFinal = 4.00 * qtd;
		} else if (codigo == 2) {
			precoFinal = 4.50 * qtd;
		} else if (codigo == 3) {
			precoFinal = 5.00 * qtd;
		} else if (codigo == 4) {
			precoFinal = 2.00 * qtd;
		} else if (codigo == 5) {
			precoFinal = 1.50 * qtd;
		} else {
			System.out.println("Codigo invalido");
		}	
		
		System.out.printf("Total: R$ %.2f", precoFinal);
		sc.close();
	}

}
