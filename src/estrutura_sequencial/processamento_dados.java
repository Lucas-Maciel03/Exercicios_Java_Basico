package estrutura_sequencial;

public class processamento_dados {

	public static void main(String[] args) {
		System.out.println("Exemplo 1");
		
		int x, y;
		double z;
		
		x = 5;
		y = 2 * x;
		z = 3 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println("Exemplo 2");
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		System.out.println("Exemplo 3 CASTING");
		
		int num1, num2;
		double resultado;
		
		num1 = 5;
		num2 = 2;
		resultado = (double) num1/ num2; //sem o casting o resultado nao estartia correto
		
		System.out.println(resultado);
		
		System.out.println("Exemplo 4 Casting");
		
		double num3;
		int num4;
		
		num3 = 5.0;
		num4 = (int) num3; //casting para avisar ao compilador que mnao importa se ira perder informações
		
		System.out.println(num4);

	}

}
