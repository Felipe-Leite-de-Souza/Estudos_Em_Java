package testeChekout;

import caixa.Checkout;
import caixa.Compra;
import exmploDeInterface.Impressora;
import impressoras.ImpressoraEpson;
import impressoras.ImpressoraHP;
import operadorasDeCartao.Digio;
import operadorasDeCartao.Nubank;
import pagamento.Cartao;
import pagamento.Operadora;

public class TesteChekout {

	public static void main(String[] args) {
		Operadora operadora = new Digio();
		Impressora impressora = new ImpressoraEpson();
		
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Tarantino Silveira");
		cartao.setNumeroCartao("382");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Tarantino Silveira");
		compra.setProduto("Perfume");
		compra.setValorTotal(243.00);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompara(compra, cartao);
		
		System.out.println("\n\n\n");
		
		// Alterando de cartão e impressora
		
		Operadora operadora1 = new Nubank();
		Impressora impressora1 = new ImpressoraHP();
		
		Cartao cartao1 = new Cartao();
		cartao1.setNomeTitular("Kleber Perreira");
		cartao1.setNumeroCartao("260");
		
		Compra compra1 = new Compra();
		compra1.setNomeCliente("Kleber Perreira");
		compra1.setProduto("Playstation 3");
		compra1.setValorTotal(1800.00);
		
		Checkout checkout1 = new Checkout(operadora1, impressora1);
		checkout1.fecharCompara(compra1, cartao1);
	}

}
