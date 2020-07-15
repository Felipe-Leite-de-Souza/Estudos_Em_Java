package financeiro;

public class Principal {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Inova Im�veis - Neg�cios Imobili�rios");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Candinho");
		
		Cliente atacadista = new Cliente();
		atacadista.setNome("Atacadista Tr�s Irm�os");
		Cliente telefonia = new Cliente();
		telefonia.setNome("Master Communication");
		
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel de matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("20/07/2020");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do m�s", 785d, "19/06/2020");
		
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de software de log�stica");
		contaReceber1.setValor(100000d);
		contaReceber1.setDataVencimento("17/06/2020");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telefonia, "Manuten��o do sistema de pagamentos", 80000d, "22/06/2020");
		
		try {
			contaPagar1.pagar();
			contaPagar2.cancelar();
			contaReceber1.receber();
			contaReceber2.cancelar();
		} catch(OperacaoContaException e) {
			System.out.println("Erro na opera��o: " + e.getMessage());
		}
		
		
		/*
		 * Exibi��o de relat�rio
		 * 
		RelatorioContas relatorioContas = new RelatorioContas();
		Conta[] contas = new Conta[] {contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		
		relatorioContas.exibirListaDeContas(contas);
		*/
	}

}
