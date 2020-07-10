package poo;

public class Principal4 {

	public static void main(String[] args) {
		Paciente paciente = new Paciente();
		paciente.peso = 100;
		paciente.altura = 1.65;
		
		IMC imc = paciente.calcularIndiceDeMassaCorporal();
		
		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso Ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de lobesidade: " + imc.grauObesidade);

	}

}
