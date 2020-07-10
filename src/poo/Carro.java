package poo;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	Proprietario dono;
	
	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
		
	}
	
	void alteraModelo(String modelo) {
		if (modelo != null) {
			this.modelo = modelo;
		}
	}

}
