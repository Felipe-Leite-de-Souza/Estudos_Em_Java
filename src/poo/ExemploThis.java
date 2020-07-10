package poo;

public class ExemploThis {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Pailo";
		
		carro.alteraModelo("Civic");
		
		System.out.println("Modelo: " + carro.modelo);

	}

}
