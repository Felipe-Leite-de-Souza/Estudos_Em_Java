package calculandoimc;

import java.util.Scanner;

public class CalculoDoIMC {

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
