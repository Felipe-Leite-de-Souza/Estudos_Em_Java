package calculandoimc;

import java.util.Scanner;

/**
 * Essa classe � �til para fazer o c�lculo do IMC - O IMC � baseado no peso e altura da pessoa.
 *  
 * @author Felipe Souza
 *
 */

public class CalculoDoIMC {
	
	/**
	 * O m�todo principal faz o c�lculo do IMC.
	 * 
	 * @exception IllegalArgumentException quando n�o informado o peso.
	 * @param args Recebe a entrada de dados da linha de comando.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();

		System.out.println("\nDigite sua altura: ");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);
		System.out.println("\nSeu IMC �: " + imc);

		entrada.close();
	}

}
