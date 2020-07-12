package abstrata;

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		Produto produto = new ProdutoPerecivel();
		produto.descricao = "Caixa de Leite";
		
		ProdutoPerecivel produtoPerecivel = (ProdutoPerecivel) produto;
		produtoPerecivel.dataValidade = "21/08/2020";

		produto.imprimirDescricao();
	}

}
