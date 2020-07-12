package caixa;

import exmploDeInterface.Imprimivel;
import pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel{

	private String nomeCliente;
	private String produto;
	private double valorTotal;
	
	public double getValorTotal() {
		return this.valorTotal;
	}

	public String getCabecalhoDaPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}

	public String getCorpoDaPagina() {
		return this.getNomeCliente();
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
