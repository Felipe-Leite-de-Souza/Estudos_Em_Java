package poo;

public class Principal3 {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Palio";
		
		Carro carro1 = new Carro();
		carro1.modelo = "Civic";
		
		carro.ligar();
		carro1.ligar();

	}

}
