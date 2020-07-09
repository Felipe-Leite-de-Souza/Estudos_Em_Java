package exemplosBasicos;

import java.util.Scanner;

public class ExemploContinue {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digine um número: ");
		int divisor = entrada.nextInt();

		for (int i = 100; i <= 120; i++) {
			if (i % divisor == 0) {
				continue;
			}

			System.out.println(i);
		}

		entrada.close();

	}

}
