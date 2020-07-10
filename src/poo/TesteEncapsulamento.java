package poo;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		
		ar.trocarTemperatura(21);
		System.out.println("Temperatura do ar: " + ar.mostrarTemperatura() + "°.");
		
		//Não deve trocar a temperatura pois foi definida para ficar entre 17 e 25
		ar.trocarTemperatura(10);
		System.out.println("Temperatura do ar: " + ar.mostrarTemperatura() + "°.");
		
	}

}
