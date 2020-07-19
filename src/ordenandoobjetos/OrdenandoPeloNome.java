package ordenandoobjetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Henrique", 27);
		Pessoa p2 = new Pessoa("Alessandra", 29);
		Pessoa p3 = new Pessoa("Alef", 28);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		
		Collections.sort(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
