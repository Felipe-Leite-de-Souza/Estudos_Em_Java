package politica;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {
	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}

		politicos.add(politico);

		this.partidosPoliticos.put(partidoPolitico, politicos);
	}
	
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if (politicos != null) {
			for (Politico politico : politicos) {
				total = total.add(politico.getCargo().getSalario());
			}
		}
		
		return total;
	}
	
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if (politicos != null) {
			for (Politico politico : politicos) {
				//Verifica se cargo do político é igual ao cargo informado no parâmetro
				if (politico.getCargo().equals(cargo)) {
					total = total.add(politico.getCargo().getSalario());
				}
			}
		}
		
		return total;
	}
	
}
