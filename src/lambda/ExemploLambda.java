package lambda;

import java.util.List;

public class ExemploLambda {
	
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaBuscarBanco().buscarFaturasVencidas();
		
		EnviarEmail enviadorEmail = new EnviarEmail();
		
		//Jeito antigo de fazer
		/*for (Fatura f : faturasVencidas) {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
		}*/
		
		//Novo jeito com Lambda
		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});
	}
	
}
