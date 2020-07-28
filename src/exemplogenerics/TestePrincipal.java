package exemplogenerics;

import java.util.ArrayList;
import java.util.List;

public class TestePrincipal {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();

		funcionarios.add(new Funcionario("Thiago"));
		funcionarios.add(new Funcionario("Henrique"));

		for (Funcionario f : funcionarios) {
			System.out.println("Nome do funcionário: " + f.getNome());
		}
	}

}
