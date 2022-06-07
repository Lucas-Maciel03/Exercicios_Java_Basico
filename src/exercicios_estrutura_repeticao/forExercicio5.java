package exercicios_estrutura_repeticao;

import java.util.Scanner;

public class forExercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			x = x * i;
		}
		
		System.out.println(x);
		
		sc.close();
	}

}
