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
			System.err.println("\nPagamento de conta já efetuado! ");
			System.out.println("\nDados da conta já paga: ");
			exibirInformacoesDeConta();
		} else if (SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.err.println("Está conta foi cancelada! ");
			System.out.println("Dados da conta cancelada: ");
			exibirInformacoesDeConta();
			this.situacaoConta = SituacaoConta.CANCELADA;
		} else {
			System.out.println("Conta ainda pendente!\n");
			System.out.println("~~~~~~~~ Informações para o pagamento ~~~~~~~~\n");
			exibirInformacoesDeConta();
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
