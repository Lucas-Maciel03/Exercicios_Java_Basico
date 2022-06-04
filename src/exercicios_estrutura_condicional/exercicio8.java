package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pagamento;
		System.out.println("Digite salario: ");
		double salario = sc.nextDouble();
		
		if(salario <= 2000.00) {
			System.out.println("Isento");
		} else if(salario <= 3000.00 ) {
			pagamento = (salario - 2000.00) * 0.08;
			System.out.printf("%.2f", pagamento);
		} else if(salario <= 4500.00) {
			pagamento = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("%.2f", pagamento);
		} else {
			pagamento = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("%.2f", pagamento);
		}
		
		sc.close();
	}

}
