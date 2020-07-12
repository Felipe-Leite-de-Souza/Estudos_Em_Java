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

	public void pagar() {

		if(SituacaoConta.PAGA.equals(getSituacaoConta())) {
			System.err.println("\nPagamento de conta j� efetuado! ");
			System.out.println("\nDados da conta j� paga: ");
			exibirInformacoesDeConta();
		} else if (SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.err.println("Est� conta foi cancelada! ");
			System.out.println("Dados da conta cancelada: ");
			exibirInformacoesDeConta();
			this.situacaoConta = SituacaoConta.CANCELADA;
		} else {
			System.out.println("Conta ainda pendente!\n");
			System.out.println("~~~~~~~~ Informa��es para o pagamento ~~~~~~~~\n");
			exibirInformacoesDeConta();
			this.situacaoConta = SituacaoConta.PAGA;
		}
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
