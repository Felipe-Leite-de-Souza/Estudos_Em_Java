package exemplosBasicos;

import java.util.Scanner;

/*
 * Construa um programa em que o usuário entre com a velocidade da via, tipo do veículo (passeio ou caminhão),
 * velocidade do veículo.
 * O programa deve cálcular em base das velocidades se uma multa deve ser ou não aplicada.
 * O cálculo para aplicar uma multa para automóveis do tipo passeio é se o automóvel ultrapssar mais de 10% 
 * da velocidade permitida na via.
 *  O cálculo para aplicar uma multa para automóveis do tipo caminhão é se o automóvel ultrapssar mais de 5% 
 * da velocidade permitida na via.
 */

public class DepartamentoDeTransito {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a velocidade da via: ");
		float velocidadeVia = entrada.nextFloat();
		
		System.out.println("Digite 1 para veículo de passeio ou outro número para caminhão: ");
		char veiculo = entrada.nextShort() == 1 ? 'P' : 'C';
		
		System.out.println("Digite a velocidade do veículo: ");
		float velocidade = entrada.nextFloat();
		
		
		if ((veiculo == 'P' && velocidade > velocidadeVia * 1.1) || (veiculo == 'C' && velocidade > velocidadeVia * 1.05)) {
			System.out.println("Velocidade ultrapassou o limite de velocidade aceitável. Aplicar Multa!");
		}else {
			System.out.println("Velocidade dentro do limite.");
		}
		
		entrada.close();

	}

}
