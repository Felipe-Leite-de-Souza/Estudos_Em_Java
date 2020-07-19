package ordenandoobjetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Henrique", 27);
		Pessoa p2 = new Pessoa("Alessandra", 29);
		Pessoa p3 = new Pessoa("Alef", 28);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		IdadeComparator idadeComparator = new IdadeComparator();
		
		
		//Antes do Java 8
		Collections.sort(pessoas, idadeComparator);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}		
		
		//Java 8
		/*
		
		pessoas.sort(idadeComparator);
		
		//Para cada elemento de pessoas chame o método println
		pessoas.forEach(System.out::println);
		
		*/
		
	}

}
