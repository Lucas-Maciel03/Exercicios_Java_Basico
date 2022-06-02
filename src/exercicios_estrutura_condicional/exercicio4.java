package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, total;
		
		System.out.println("Digite horario do inicio do jogo: ");
		inicio = sc.nextInt();
		
		System.out.println("Digite horario do fim do jogo: ");
		fim = sc.nextInt();
		
		
		if(inicio > fim) {
			total = (24 - inicio) + fim;
			System.out.printf("O jogo durou %d horas", total);
		} else {
			total = fim - inicio;
			System.out.printf("O jogo durou %d horas", total);
		}
		
		sc.close();
	}

}
