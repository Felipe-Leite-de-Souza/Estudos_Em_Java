package corretoraDeSeguros;

public class Notebook implements Seguravel {
	private double valorMercado;
	private int anoFabricacao;
	private String marca;
	private String modelo;
	
	public Notebook(double valorMercado, int anoFabricacao, String marca, String modelo) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
		this.marca = marca;
		this.modelo = modelo;
	}

	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.5;
		if (anoFabricacao < 2005) {
			valorApolice = valorApolice * 0.73;
		}
		return valorApolice;
	}
	
	public String obterDescricao() {
		return "Notebook: " + this.marca + "\nModelo: " + this.modelo + "\nAno de Fabricação: " + this.anoFabricacao + "\nValor de mercado: " + this.valorMercado;
	}
	
	
}
