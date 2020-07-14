package megaSena;

import java.util.Scanner;

public class MegaSena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos jogos?");
		int quantidadeJogos = entrada.nextInt();

		System.out.println("----------------------------");

		for (int i = 1; i <= quantidadeJogos; i++) {
			SorteiaNumeros sorteiaNumeros = new SorteiaNumeros();
			sorteiaNumeros.sorteio();
			sorteiaNumeros.exibirNumeros();
			System.out.println("----------------------------");
		}

		System.out.println("\n======== Boa sorte! ========");
		
		entrada.close();
	}

}
