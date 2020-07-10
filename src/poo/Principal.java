package poo;

public class Principal {

	public static void main(String[] args) {
		Carro carro0 = new Carro();
		carro0.fabricante = "Fiat";
		carro0.modelo = "Palio";
		carro0.anoDeFabricacao = 2011;
		carro0.cor = "Prata";
		
		Carro carro1 = new Carro();
		carro1.fabricante = "Honda";
		carro1.modelo = "Civic";
		carro1.anoDeFabricacao = 2009;
		carro1.cor = "Preto";
		
		System.out.println("Carro");
		System.out.println("Fabricante: " + carro0.fabricante);
		System.out.println("Modelo: " + carro0.modelo);
		System.out.println("Ano de fabricação: " + carro0.anoDeFabricacao);
		System.out.println("Modelo: " + carro0.modelo);
		System.out.println("Modelo: " + carro0.cor);
		
		System.out.println("\n--------------------\n");
		System.out.println("Carro");
		System.out.println("Fabricante: " + carro1.fabricante);
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Ano de fabricação: " + carro1.anoDeFabricacao);
		System.out.println("Modelo: " + carro1.cor);
		

	}

}
