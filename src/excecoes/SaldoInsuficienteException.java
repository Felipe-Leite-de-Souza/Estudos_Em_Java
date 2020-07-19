package excecoes;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
	
}
