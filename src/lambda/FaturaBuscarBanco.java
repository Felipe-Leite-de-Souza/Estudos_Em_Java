package lambda;

import java.util.ArrayList;
import java.util.List;

public class FaturaBuscarBanco {
	
	public List<Fatura> buscarFaturasVencidas() {
		// Obviamente você buscaria isso no banco de dados...
		
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("devedor01@hotmail.com", 384.95));
		faturas.add(new Fatura("devedor02@gmail.com", 149.90));
		faturas.add(new Fatura("devedor03@outlook.com", 59.96));
		
		return faturas;
	}
}
