package exemplosBasicos;

import java.util.Scanner;

/*
 * Contruir um programa onde o usu�rio dever� informar um ano que deseja saber se � ou n�o bissexto.
 */

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um ano que gostaria de saber se � ou n�o bissexto: ");
		int ano = entrada.nextInt();
		
		if (ano % 400 == 0) {
			System.out.println("O ano " + ano + " � bissexto.");
		} else if (ano % 4 == 0){
				if (ano % 100 == 0) {
					System.out.println("O ano " + ano + " � bissexto.");
				}else {
					System.out.println("O ano " + ano + " n�o � bissexto.");
				}
		} else {
			System.out.println("O ano " + ano + " n�o � bissexto.");
		}
		
		
		entrada.close();

	}

}
