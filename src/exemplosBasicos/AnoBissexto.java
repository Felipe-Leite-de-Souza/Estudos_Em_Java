package exemplosBasicos;

import java.util.Scanner;

/*
 * Contruir um programa onde o usuário deverá informar um ano que deseja saber se é ou não bissexto.
 */

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um ano que gostaria de saber se é ou não bissexto: ");
		int ano = entrada.nextInt();
		
		if (ano % 400 == 0) {
			System.out.println("O ano " + ano + " é bissexto.");
		} else if (ano % 4 == 0){
				if (ano % 100 == 0) {
					System.out.println("O ano " + ano + " é bissexto.");
				}else {
					System.out.println("O ano " + ano + " não é bissexto.");
				}
		} else {
			System.out.println("O ano " + ano + " não é bissexto.");
		}
		
		
		entrada.close();

	}

}
