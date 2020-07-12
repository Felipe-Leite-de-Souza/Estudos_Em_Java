package operadorasDeCartao;

import pagamento.Autorizavel;
import pagamento.Cartao;
import pagamento.Operadora;

public class Nubank implements Operadora {

	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("260") && autorizavel.getValorTotal() < 2000;
	}

}
