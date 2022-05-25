package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c= sc.nextDouble();
		
		System.out.printf("Triangulo: %.3f%n", (a * c) / 2);
		System.out.printf("Circulo: %.3f%n", Math.PI * Math.pow(c, 2));
		System.out.printf("Trapezio: %.3f%n", (a + b) * c / 2);
		System.out.printf("Quadrado: %.3f%n", b * b);
		System.out.printf("Retangulo: %.3f%n", a * b);
		sc.close();
	}

}
