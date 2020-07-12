package impressoras;

import exmploDeInterface.Impressora;
import exmploDeInterface.Imprimivel;

public class ImpressoraHP implements Impressora {

	public void imprimir(Imprimivel imprimivel) {
		System.out.println("==================================================");
		System.out.println(imprimivel.getCabecalhoDaPagina());
		System.out.println("==================================================");
		System.out.println(imprimivel.getCorpoDaPagina());
		System.out.println("\n--------------------------------------------------");
		System.out.println("================= Impressora HP ==================");
		System.out.println("--------------------------------------------------");
	}

}
