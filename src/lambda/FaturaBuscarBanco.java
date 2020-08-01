package lambda;

import java.util.ArrayList;
import java.util.List;

public class FaturaBuscarBanco {
	
	public List<Fatura> buscarFaturasVencidas() {
		// Obviamente você buscaria isso no banco de dados...
		
		/*
		 * Diamond do Java 7 com ele não necessitamos afirmar o 
		 * tipo do array que queremos
		 */
		
		//Sem Diamond
		
		//List<Fatura> faturas = new ArrayList<Fatura>();
		
		//Com Diamond
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("devedor01@hotmail.com", 384.90));
		faturas.add(new Fatura("devedor02@gmail.com", 149.50));
		faturas.add(new Fatura("devedor03@outlook.com", 59.10));
		
		return faturas;
	}
}
