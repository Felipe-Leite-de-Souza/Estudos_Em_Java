package televisor;

/*
 * Construa um programa que simule a troca de canais e volume de um televisor (wrapper).
 */

import java.util.Scanner;

public class TesteTelevisor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Televisor tv = new Televisor();
		
		tv.ligarTv();
		tv.desligarTv();
		
		entrada.close();
		
	}

}
