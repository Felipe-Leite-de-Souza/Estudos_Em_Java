package caixa;

import exmploDeInterface.Impressora;
import pagamento.Cartao;
import pagamento.Operadora;

public class Checkout {
	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompara(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
		} else {
			System.err.println("Pagamento negado!");
		}
		
	}
	
}
