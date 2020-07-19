package calculandoimc;

import java.util.Scanner;

/**
 * Essa classe é útil para fazer o cálculo do IMC - O IMC é baseado no peso e altura da pessoa.
 *  
 * @author Felipe Souza
 *
 */

public class CalculoDoIMC {
	
	/**
	 * O método principal faz o cálculo do IMC.
	 * 
	 * @exception IllegalArgumentException quando não informado o peso.
	 * @param args Recebe a entrada de dados da linha de comando.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();

		System.out.println("\nDigite sua altura: ");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);
		System.out.println("\nSeu IMC é: " + imc);

		entrada.close();
	}

}
