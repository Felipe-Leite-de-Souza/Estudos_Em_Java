package lambda;

import java.util.List;

public class ReferenciamentoDeMetodo {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaBuscarBanco().buscarFaturasVencidas();

		//Com for iterativo
		/*
		for (Fatura f : faturasVencidas) {
			f.atualizarStatus();
		}
		*/

		//Com forEach e Lambda
		//faturasVencidas.forEach(f -> f.atualizarStatus());

		//Refer�ncia a M�todos
		faturasVencidas.forEach(Fatura::atualizarStatus);

	}

}
