package exemplogenerics;

import java.util.ArrayList;
import java.util.List;

public class TesteDoRetirandoItens {

	public static void main(String[] args) {
		List<Funcionario> nomes = new ArrayList<>();
		nomes.add(new Funcionario("Ana"));

		Funcionario f = RetirandoItens.recuperaPrimeiro(nomes);
		System.out.println(f.getNome());
	}

}
