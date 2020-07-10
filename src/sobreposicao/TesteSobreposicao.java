package sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
	
	public static void main(String[] args) {
		ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();
		produtoPerecivel.descricao = "Peixe";
		produtoPerecivel.dataDeValidade = new Date();
		produtoPerecivel.identificarProduto();	
	}
	
}
