package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("sao multiplos");
		} else {
			System.out.println("nao sao multiplos");
		}
		
		sc.close();
	}

}
