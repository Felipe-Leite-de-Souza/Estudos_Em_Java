package atacadista;

import java.util.Scanner;

/*
 * Construa um programa que tem a finalidade de ser um cadastramento de estoque (utilizando Array).
 * O programa dever� perguntar ao usu�rio primeiramente quantos itens ele deveja inserir.
 * O programa dever� perguntar o nome do produto e sua quantidade.
 * Ao t�rmino do cadastro dos intens os mesmo dever�o ser impresos na tela para o usu�rio.
 */

public class CadastramentoDeEstoque {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao cadastramento de Estoque.");
		
		Estoque estoque = new Estoque();
		estoque.cadastroDeProduto();
		
		entrada.close();

	}

}
