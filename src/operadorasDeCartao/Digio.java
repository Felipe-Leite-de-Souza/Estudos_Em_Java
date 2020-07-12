package operadorasDeCartao;

import pagamento.Autorizavel;
import pagamento.Cartao;
import pagamento.Operadora;

public class Digio implements Operadora {

	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("382") && autorizavel.getValorTotal() < 1000;
	}
	
}
