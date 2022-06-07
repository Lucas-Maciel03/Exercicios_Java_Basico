package exercicios_estrutura_repeticao;

import java.util.Scanner;

public class forExercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
		}
		
		sc.close();
	}

}
