package estrutura_sequencial;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35786;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); //%.2f é pra formatar o valor. %n é pra quebrar linha.
		Locale.setDefault(Locale.US); //configurando a localidade do programa para US
		
		//concatenar varios elementos em um comando de escrita
		System.out.println("RESULTADO = " + x + " METROS"); 
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}

