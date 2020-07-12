package corretoraDeSeguros;

public class Barco implements Seguravel {
	private double valorMercado;
	private int anoFabricacao;
	private String modelo;
	
	public Barco(double valorMercado, int anoFabricacao, String modelo) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
	}

	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.07;
		if (anoFabricacao < 1995) {
			valorApolice = valorApolice * 0.63; 
		}
		return valorApolice;
	}

	public String obterDescricao() {
		return "Barco do modelo: " + this.modelo + "\nAno de Fabricação: " + this.anoFabricacao + "\nValor de mercado de: " + this.valorMercado;
	}	

}
