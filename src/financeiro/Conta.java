package financeiro;

public class Conta {
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public void exibirInformacoesDeConta() {
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("Data do vencimento: " + dataVencimento + "\n");
		this.situacaoConta = SituacaoConta.PAGA;
	}
	
	public void cancelar() {
		if(SituacaoConta.PAGA.equals(getSituacaoConta())) {
			System.out.println("Não se pode cancelar uma conta que já foi paga!\n");
			System.out.println("Dados da conta já paga: ");
			exibirInformacoesDeConta();
		} else if(SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.out.println("Não se pode cancelar uma conta que já foi cancelada!\n");
			System.out.println("Dados da conta cancelada:");
			exibirInformacoesDeConta();
		} else {
			System.out.println("Conta cancelada!\n");
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Dados da conta cancelada: ");
			exibirInformacoesDeConta();
			
		}
	}
	
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
