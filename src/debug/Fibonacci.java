package debug;

public class Fibonacci {
	/*
	 * Sequência de Fibonacci
	 * Via de regra:
	 * F(n) = F(n-1) + F(n-2)
	 * 0, 1, 1, 2, 3, 5, 8, 13, ...
	 * Tendo em mente que:
	 * F(0) = 0, F(1) = 1
	 */
	public static long calcula(long posicao) {
		if (posicao == 0 || posicao == 1) {
			return posicao;
		}
		
		long valor1 = calcula(posicao -1);
		long valor2 = calcula(posicao -2);
		return valor1 + valor2;
		
	}
	
}
