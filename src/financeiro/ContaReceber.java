package financeiro;

public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	public ContaReceber(){}
	
	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento){
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public void receber() {
		if(SituacaoConta.PAGA.equals(getSituacaoConta())) {
			System.out.println("Não se pode cancelar uma conta que já foi paga!\n");
			System.out.println("Dados da conta já paga: ");
			exibirInformacoesDeConta();
		} else if(SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.out.println("Não se pode cancelar uma conta que já foi cancelada!\n");
			System.out.println("Dados da conta cancelada: ");
			exibirInformacoesDeConta();
		} else {
			System.out.println("Conta cancelada!\n");
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Dados da conta cancelada: ");
			exibirInformacoesDeConta();
		}
	}
	
	public void cancelar() {
		if(this.getValor() > 50000) {
			System.out.println("Conta  a receber acima de 50 mil reais não pode ser cancelada.\n");
			System.out.println("Dados da conta: ");
			exibirInformacoesDeConta();
		} else {
			super.cancelar();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
