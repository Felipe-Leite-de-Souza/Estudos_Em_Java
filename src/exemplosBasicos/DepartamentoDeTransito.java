package exemplosBasicos;

import java.util.Scanner;

/*
 * Construa um programa em que o usu�rio entre com a velocidade da via, tipo do ve�culo (passeio ou caminh�o),
 * velocidade do ve�culo.
 * O programa deve c�lcular em base das velocidades se uma multa deve ser ou n�o aplicada.
 * O c�lculo para aplicar uma multa para autom�veis do tipo passeio � se o autom�vel ultrapssar mais de 10% 
 * da velocidade permitida na via.
 *  O c�lculo para aplicar uma multa para autom�veis do tipo caminh�o � se o autom�vel ultrapssar mais de 5% 
 * da velocidade permitida na via.
 */

public class DepartamentoDeTransito {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a velocidade da via: ");
		float velocidadeVia = entrada.nextFloat();
		
		System.out.println("Digite 1 para ve�culo de passeio ou outro n�mero para caminh�o: ");
		char veiculo = entrada.nextShort() == 1 ? 'P' : 'C';
		
		System.out.println("Digite a velocidade do ve�culo: ");
		float velocidade = entrada.nextFloat();
		
		
		if ((veiculo == 'P' && velocidade > velocidadeVia * 1.1) || (veiculo == 'C' && velocidade > velocidadeVia * 1.05)) {
			System.out.println("Velocidade ultrapassou o limite de velocidade aceit�vel. Aplicar Multa!");
		}else {
			System.out.println("Velocidade dentro do limite.");
		}
		
		entrada.close();

	}

}
