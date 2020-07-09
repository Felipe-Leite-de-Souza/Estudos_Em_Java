package matematica;

/*
 * Crie uma classe que tenha dois m�todos, um para calcular um n�mero fibonacci e outro para calcular a �rea de um c�rculo.
 * Crie um programa para executar esses m�todos levando em conta para o c�lculo fibonacci o n�mero 8 
 * e para a �rea do c�rculo 104.8 
 */

public class TesteMatematica {

	public static void main(String[] args) {
		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("N�mero de Fibonacci da posi��o 8: " + numeroFibonacci);
		
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("�rea do circulo: " + areaCirculo);
		

	}

}
