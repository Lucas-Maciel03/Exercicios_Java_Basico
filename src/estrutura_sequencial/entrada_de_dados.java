package estrutura_sequencial;

import java.util.Scanner; //importando a lib do scanner

public class entrada_de_dados {

	public static void main(String[] args) {
		//iniciando o scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); //para o programa e o usuario digita oq deseja
		System.out.println("Voce digitou: " + x);
			
		sc.close(); //fechando o scanner
	}

}
