package exemplosBasicos;

import java.util.Scanner;

/*
 * Construir um programa para avisar sobre a data de vencimento do IPVA pelo digito final da placa.
 * O programa dever� informar APENAS as placas de final 1 e 2. Para as demais placas dever� emitir
 * uma mensagem para o usu�rio informando-o que ainda n�o h� data de vencimento.
 */

public class PagamentoDeIPVA {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o final da placa: ");
		int finalPlaca = entrada.nextInt();

		switch (finalPlaca) {
		case 1:
			System.out.println("Vencimento dia 11 de Janeiro.");
			break;

		case 2:
			System.out.println("Vencimento dia 12 de Janeiro.");
			break;

		default:
			System.out.println("Vencimento sem data, desculpe.");
			break;
		}


		entrada.close();

	}

}
