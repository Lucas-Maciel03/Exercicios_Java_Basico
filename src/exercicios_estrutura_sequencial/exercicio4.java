package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		double valorHora, salario;
		
		numero = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
	}

}
