package financeiro;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;


	public ContaPagar() {}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void pagar() throws OperacaoContaException {

		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("\\nPagamento de conta j� efetuado!" + getDescricao());
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Est� conta foi cancelada!" + getDescricao());
		} else {
			System.out.println("Conta ainda pendente!\n");
			System.out.println("~~~~~~~~ Informa��es para o pagamento ~~~~~~~~\n");
			this.situacaoConta = SituacaoConta.PAGA;
		}
		exibirInformacoesDeConta();
	}
	
	public void exibirDetalhes() {
		System.out.println("\nContas a Pagar");
		System.out.println("--------------------------------------------------");
		System.out.println("Fornecedor: " + this.getFornecedor().getNome());
		System.out.println("Descri��o: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de Vencimento: " + this.getDataVencimento());
		System.out.println("Situa��o: " + this.getSituacaoConta());
		System.out.println("--------------------------------------------------\n\n");
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
