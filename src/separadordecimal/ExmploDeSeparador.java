package separadordecimal;

public class ExmploDeSeparador {

	public static void main(String[] args) {
		
		/*No Java 7 foi implementado como separador o "_" (Underline).
		 * Pode ser usado para diversas separa��es como 
		 * long, double, int, ele n�o aparece pois � retirado 
		 * no momento de execu��o. 
		 */
		
		long populacaoBrasil = 209_500_000L;
		long populacaoDeSaoPaulo = 209_500_000 - 197_320_000;
		
		System.out.println("Popula��o do Brasil: " + populacaoBrasil);
		System.out.println("Popula��o de S�o Paulo: " + populacaoDeSaoPaulo);
		
		double precoCasa = 200_000.00d;
		System.out.printf("Pre�o da casa: %.3f\n", precoCasa);
		
		int a = 10____11__12;
		int b = 10_11_12;
		System.out.printf("S�o iguais: %b", (a == b));

	}

}
