package corretoraDeSeguros;

public class Imovel implements Seguravel {
	
	private double valorMercado;
	private int areaConstruida;
	
	public Imovel(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	public double calcularValorApolice() {	
		double valorApoilice = this.valorMercado * 0.003;
		valorApoilice = valorApoilice + (areaConstruida * 0.5);
		return valorApoilice;
	}

	public String obterDescricao() {
		return "Imóvel com área construída de: " + this.areaConstruida + "m²" + "\nValor de mercado: " + this.valorMercado;
	}
	
}
