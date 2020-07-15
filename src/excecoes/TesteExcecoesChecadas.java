package excecoes;

//Erros de negócios

public class TesteExcecoesChecadas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(100);


		try {
			System.out.println("Saldo anterior: " + contaCorrente.getSaldo());
			contaCorrente.sacar(30);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo Insuficiente!\n\n");
		}
		System.out.println("Saldo após o saque: " + contaCorrente.getSaldo() + "\n\n");

		try {
			System.out.println("Saldo anterior: " + contaCorrente.getSaldo());
			contaCorrente.sacar(10);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo Insuficiente!\n\n");
		}
		
		finally {
			System.out.println("Saldo atual: " + contaCorrente.getSaldo() + "\n\n");
			System.out.println("Obrigado por utilizar nosso sistema.");
		}
		

	}

}
