package televisor;

import java.util.Scanner;

public class Televisor {
	Scanner entrada = new Scanner(System.in);
	Integer canal = 130;
	Integer volume = 20;

	public void ligarTv() {
		inicio();
	}

	public void inicio() {
		System.out.println("Canal: " + canal);
		System.out.println("Volume: " + volume + "\n");
		mudarCanal();
		mudarVolume();
	}

	public void mudarCanal() {
		System.out.println("Gostaria de selecionar outro canal?");
		System.out.println("Precione 1 - Sim");
		System.out.println("Precione 2 - Não");
		int respostaCanal = entrada.nextInt();

		if(respostaCanal == 1) {
			menuDeCanais();
		} else if(respostaCanal == 2) {
			System.out.println("\nTenho um bom entretenimento.");
			System.out.println("Canal atual: " + canal + "\n");
		} else {
			System.out.println("\nOpção inválida!");
			System.out.println("Voltando para o menu!\n");
		}
	}


	public void mudarVolume() {
		System.out.println("Gostaria de alterar o volume?");
		System.out.println("Precione 1 - Sim");
		System.out.println("Precione 2 - Não");
		int respostaVolume = entrada.nextInt();

		if(respostaVolume == 1) {
			nivelDeVolume();
			System.out.println("\nVolume alterado para: " + volume + "\n");
		} else if(respostaVolume == 2) {
			System.out.println("\nSem alteração no volume.");
			System.out.println("Volume atual: " + volume + "\n");
		} else {
			System.out.println("\nOpção inválida!");
			System.out.println("Voltando para o menu!\n");
		}
		
		System.out.println();
	}


	public void menuDeCanais() {
		exibeListaDeCanais();
		int opcao = entrada.nextInt();
		switch (opcao) {
		case 10:
			//System.out.println("Canal Alterado para:");
			System.out.println("Canal 10 - Bandeirantes");
			break;

		case 40:
			System.out.println("Canal 40 - Cultura");
			break;

		case 80:
			System.out.println("Canal 80 - Gazeta");
			break;

		case 100:
			System.out.println("Canal 100 - Globo");
			break;

		case 117:
			System.out.println("Canal 117 - MTV");
			break;

		case 130:
			System.out.println("Canal 130 - Record News");
			break;

		case 146:
			System.out.println("Canal 146 - Rede 21");
			break;

		case 254:
			System.out.println("Canal 254 - SBT");
			break;

		case 262:
			System.out.println("Canal 262 - TV Brasil");
			break;

		default:
			System.out.println("Canal não encontrado!");
			exibeListaDeCanais();
			break;
		} while (opcao == 0);
	}

	public void exibeListaDeCanais() {
		System.out.println("=====Lista de canais=====\n");
		System.out.println("Canal 10 - Bandeirantes");
		System.out.println("Canal 40 - Cultura");
		System.out.println("Canal 80 - Gazeta");
		System.out.println("Canal 100 - Globo");
		System.out.println("Canal 117 - MTV");
		System.out.println("Canal 130 - Record News");
		System.out.println("Canal 146 - Rede 21");
		System.out.println("Canal 254 - SBT");
		System.out.println("Canal 262 - TV Brasil");
		System.out.println("\nPor favor selecione o canal de sua preferência ou precione 0 para cancelar a mudança de canal:");
	}

	public int nivelDeVolume() {
		System.out.println("Selecione o nível do volume entre 0 à 100: ");
		int novoVolume = entrada.nextInt();
		volume = novoVolume;
		return volume;
	}

	public void desligarTv() {
		System.out.println("Dejesa desligar a TV?");
		System.out.println("Precione 1 - Sim");
		System.out.println("Precione 2 - Não");
		int respostaDesligar = entrada.nextInt();

		if (respostaDesligar == 1) {
			System.out.println("Desligando...");
		}else {
			System.out.println("Desligamento cancelado");
		}
	}
	
}
