package exercicios_estrutura_repeticao;

import java.util.Scanner;

public class forExercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			if(x % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
