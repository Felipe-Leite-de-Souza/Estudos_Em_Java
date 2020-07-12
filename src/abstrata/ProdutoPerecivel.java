package abstrata;

public class ProdutoPerecivel extends Produto{
	String dataValidade;

	public void imprimirDescricao() {
		System.out.println("Descrição: " + super.getDescricao());
		System.out.println("Validade: " + dataValidade);
	}
}
