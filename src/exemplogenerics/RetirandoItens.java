package exemplogenerics;

import java.util.List;

public class RetirandoItens {

	public static <T> T recuperaPrimeiro(List<T> lista) {
		return lista.get(0);
	}

}
