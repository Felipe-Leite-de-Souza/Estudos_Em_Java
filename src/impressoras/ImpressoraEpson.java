package impressoras;

import exmploDeInterface.Impressora;
import exmploDeInterface.Imprimivel;

public class ImpressoraEpson implements Impressora {

	public void imprimir(Imprimivel imprimivel) {
		System.out.println(imprimivel.getCabecalhoDaPagina());
		System.out.println("--------------------------------------------------");
		System.out.println(imprimivel.getCorpoDaPagina());
		System.out.println("===================================================");
		System.out.println("---------------- Impressora Epson -----------------");
		System.out.println("===================================================");
	}

}
