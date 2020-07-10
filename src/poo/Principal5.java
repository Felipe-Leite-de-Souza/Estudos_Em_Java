package poo;

public class Principal5 {

	public static void main(String[] args) {
		FolhaDePagamento folha = new FolhaDePagamento();
		double salario = folha.calcularSalario(160, 12, 32.5, 40.20);
		
		System.out.println("Salário calculado: " + salario);

	}

}
