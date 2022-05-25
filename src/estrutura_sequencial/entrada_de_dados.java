package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner; //importando a lib do scanner

public class entrada_de_dados {

	public static void main(String[] args) {
		//setando localidade us
		Locale.setDefault(Locale.US);
		//iniciando o scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); //para o programa e o usuario digita oq deseja
		System.out.println("Voce digitou: " + x);
			
		int y; 
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		
		double z; 
		z = sc.nextDouble();
		System.out.println("Voce digitou: " + z);
		
		char c; 
		c = sc.next().charAt(0);
		System.out.println("Voce digitou: " + c);
		
	
		/*
		 * String - sc.next()
		 * int -  - sc.nextInt()
		 * double - sc.nextDouble()
		 * char - sc.next().charAt(posicao)
		 */
		
		
		sc.close(); //comando para encerrar o scanner
	}

}
