package financeiro;

public class RelatorioContas {
	
	public void exibirListaDeContas(Conta[] contas) {
		System.out.println("===================================================");
		System.out.println("------ Relat�rio de Contas a Pagar e Receber ------");
		System.out.println("===================================================");		
		
		for (int i =0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
		}
		System.out.println("\n\n===================================================");	
		System.out.println("------------ Fim do Relat�rio de Contas -----------");
		System.out.println("===================================================");	
	}
}
