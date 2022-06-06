package estrutura_repeticao;

import java.util.Scanner;

public class estruturaFor {

	public static void main(String[] args) {
		/* for é usado quando se sabe previamente o intervalo de repeticoes
		 * ou o intervalo de valores.
		 * */
		
		Scanner sc = new Scanner(System.in);
	
		int soma = 0;
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
