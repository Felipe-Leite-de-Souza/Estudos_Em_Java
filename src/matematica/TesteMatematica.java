package matematica;

/*
 * Crie uma classe que tenha dois métodos, um para calcular um número fibonacci e outro para calcular a área de um círculo.
 * Crie um programa para executar esses métodos levando em conta para o cálculo fibonacci o número 8 
 * e para a área do círculo 104.8 
 */

public class TesteMatematica {

	public static void main(String[] args) {
		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);
		
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("Área do circulo: " + areaCirculo);
		

	}

}
