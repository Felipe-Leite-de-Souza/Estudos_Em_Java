package atacadista;

import java.util.Scanner;

public class Estoque {
	Scanner entrada = new Scanner(System.in);
	Produto[] produtos;
	
	public void exibirProdutos() {
		System.out.println("~~~~~~~~~~Estoque~~~~~~~~~~");
		System.out.println("\n\nProtudos em estoque: \n");
		
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].informacaoDoProduto();
			System.out.println();
		}
	}

	public void cadastroDeProduto() {
		System.out.println("Insira a quantidade de produtos a serem cadastrados: ");
		int quantidadeDeCadastro = entrada.nextInt();
		
		entrada.nextLine();
		
		Estoque estoque = new Estoque();
		estoque.produtos = new Produto[quantidadeDeCadastro];
		
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println("\n\nProduto " + i);
			
			System.out.println("\nNome do produto: ");
			estoque.produtos[i].nome = entrada.nextLine();
			
			System.out.println("Qauntidade do produto: ");
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
			
		}
		
	
		estoque.exibirProdutos();
		
		int quantidadeTotalDeProdutos = 0;
		
		for (int i = 0; i < estoque.produtos.length; i++) {
			quantidadeTotalDeProdutos +=  estoque.produtos[i].quantidade;
			
		}
		System.out.println("Quantidade total de produtos cadastrados: " + quantidadeTotalDeProdutos);
	}
	
	
	
}
