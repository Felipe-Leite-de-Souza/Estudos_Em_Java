package separadordecimal;

public class ExmploDeSeparador {

	public static void main(String[] args) {
		
		/*No Java 7 foi implementado como separador o "_" (Underline).
		 * Pode ser usado para diversas separações como 
		 * long, double, int, ele não aparece pois é retirado 
		 * no momento de execução. 
		 */
		
		long populacaoBrasil = 209_500_000L;
		long populacaoDeSaoPaulo = 209_500_000 - 197_320_000;
		
		System.out.println("População do Brasil: " + populacaoBrasil);
		System.out.println("População de São Paulo: " + populacaoDeSaoPaulo);
		
		double precoCasa = 200_000.00d;
		System.out.printf("Preço da casa: %.3f\n", precoCasa);
		
		int a = 10____11__12;
		int b = 10_11_12;
		System.out.printf("São iguais: %b", (a == b));

	}

}
