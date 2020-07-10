package financeiro;

public class Principal {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel de matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("20/07/2020");
		conta1.setFornecedor(imobiliaria);
		
		ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/06/2020");
		
		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel filial", 390d, "11/07/2020");
		
		conta1.pagar();
		
		conta2.cancelar();
		conta2.pagar();
		conta2.cancelar();
		
		conta3.pagar();
		conta3.pagar();
		conta2.cancelar();
		
	}

}
