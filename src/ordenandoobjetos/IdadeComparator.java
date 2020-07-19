package ordenandoobjetos;

import java.util.Comparator;

/*
 * Comparator utilizamos para ordenar por valor.
 * Comparator serve para comparações isoladas.
 */

public class IdadeComparator implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		if (p1.getIdade() < p2.getIdade()) {
			return -1;
		} else if (p1.getIdade() > p2.getIdade()) {
			return 1;
		} else
		return 0;
	}

}
