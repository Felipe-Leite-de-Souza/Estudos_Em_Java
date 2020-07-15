package excecoes;

public class TesteDeExcecoes {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(100);
		
		try {
			contaCorrente.depositar(-10);
		} catch (IllegalArgumentException e) {
			System.out.println("Você executou uma operação illegal: " + e.getMessage());
		}
		
		
		
	}

}
