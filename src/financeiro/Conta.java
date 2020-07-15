package financeiro;

public abstract class Conta {
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public void exibirInformacoesDeConta() {
		System.out.println("Dados da conta: ");
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("Data do vencimento: " + dataVencimento + "\n");
		this.situacaoConta = SituacaoConta.PAGA;
	}
	
	public void cancelar() throws OperacaoContaException {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Não se pode cancelar uma conta que já foi paga!\n" + getDescricao());
		} else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Não se pode cancelar uma conta que já foi cancelada!\n" + getDescricao());
		} else {
			System.out.println("Conta cancelada!\n" + getDescricao());
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
		exibirInformacoesDeConta();
	}
	
	public abstract void exibirDetalhes();
	
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
	
}
