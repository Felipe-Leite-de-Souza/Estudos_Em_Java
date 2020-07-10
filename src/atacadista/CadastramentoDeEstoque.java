package atacadista;

import java.util.Scanner;

/*
 * Construa um programa que tem a finalidade de ser um cadastramento de estoque (utilizando Array).
 * O programa deverá perguntar ao usuário primeiramente quantos itens ele deveja inserir.
 * O programa deverá perguntar o nome do produto e sua quantidade.
 * Ao término do cadastro dos intens os mesmo deverão ser impresos na tela para o usuário.
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
