package estrutura_repeticao;

import java.util.Scanner;

public class estruturaWhile {

	public static void main(String[] args) {
		/*
		 * while é usado quando nao se sabe quantas vezes o programa ira executar
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		while(n != 0) {
			soma = soma + n;
			n = sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
	}

}
