package estrutura_condicional;

public class expressaoTernaria {

	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		//(condição) ? valor_se_verdadeiro : valor_se_falso
		
		System.out.println(desconto);

	}

}
