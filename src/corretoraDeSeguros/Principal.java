package corretoraDeSeguros;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
		
		Carro carro = new Carro(60000d, 2016);
		Imovel casa = new Imovel(1500000d, 480);
		Barco barco = new Barco(500000d, 2016, "Lancha");
		Notebook notebook = new Notebook(2379d, 2019, "Asus", "X543");
		
		corretoraSeguros.fazerPropostaSeguro(carro);
		corretoraSeguros.fazerPropostaSeguro(casa);
		corretoraSeguros.fazerPropostaSeguro(barco);
		corretoraSeguros.fazerPropostaSeguro(notebook);
	}

}
