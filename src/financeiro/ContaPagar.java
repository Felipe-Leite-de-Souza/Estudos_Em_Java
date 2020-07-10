package financeiro;

public class ContaPagar {
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public ContaPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
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
	
	public void exibirInformacoesDeConta() {
		System.out.println("Fornecedor: " + fornecedor.getNome());
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("Data do vencimento: " + dataVencimento + "\n");
		this.situacaoConta = SituacaoConta.PAGA;
	}
	
	public void cancelar() {
		if(SituacaoConta.PAGA.equals(getSituacaoConta())) {
			System.out.println("Não se pode cancelar uma conta que já foi paga!\n\n");
		} else if(SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.out.println("Não se pode cancelar uma conta que já foi cancelada!\n\n");
		} else {
			System.out.println("Conta cancelada!\n\n");
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
		
		
	}
	
}
