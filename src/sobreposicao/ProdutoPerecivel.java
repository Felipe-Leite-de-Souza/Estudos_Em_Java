package sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
	
	protected Date dataDeValidade;
	
	public void identificarProduto() {
		super.identificarProduto();
		System.out.println("Minha data de validade é: " + dataDeValidade);
	}
	
}
