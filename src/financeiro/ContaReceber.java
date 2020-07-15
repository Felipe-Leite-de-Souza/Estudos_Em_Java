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
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("N�o se pode cancelar uma conta que j� foi paga!\n");
			System.out.println("Dados da conta j� paga: ");
			exibirInformacoesDeConta();
		} else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("N�o se pode cancelar uma conta que j� foi cancelada!\n");
			System.out.println("Dados da conta cancelada: ");
			exibirInformacoesDeConta();
		} else {
			System.out.println("Conta cancelada!\n");
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Dados da conta cancelada: ");
			exibirInformacoesDeConta();
		}
	}
	
	public void cancelar() throws OperacaoContaException {
		if(this.getValor() > 50000) {
			throw new OperacaoContaException("Conta a receber acima de 50 mil reais n�o pode ser cancelada.\n" + getDescricao());
		} else {
			super.cancelar();
		}
		exibirInformacoesDeConta();
	}

	public void exibirDetalhes() {
		System.out.println("\nContas a Receber");
		System.out.println("--------------------------------------------------");
		System.out.println("Cliente: " + this.getCliente().getNome());
		System.out.println("Descri��o: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de Vencimento: " + this.getDataVencimento());
		System.out.println("Situa��o: " + this.getSituacaoConta());
		System.out.println("--------------------------------------------------");
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
