package polimorfismo;

public class TesteDoPolimorfismo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(5000);
		
		System.out.println("Conta normal");
		imprimirSaldo(conta);
		System.out.println("--------------------------------------------------\n");
		
		//outra Forma de chamar o método estático (static)
		//TesteDoPolimorfismo.imprimirSaldo(conta);
		
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(4000);
		//Contexto de herança pois ContaCorrente é um objeto do tipo Conta
		
		System.out.println("Conta Corrente");
		imprimirSaldo(contaCorrente);
		System.out.println("--------------------------------------------------\n");
		
		
		Conta contaPoupanca = new ContaPoupanca();
		System.out.println("Conta Poupança");
		contaPoupanca.setSaldo(1500);
		imprimirSaldo(contaPoupanca);
		System.out.println("--------------------------------------------------\n");
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$ " + conta.getSaldo());
		
		if (conta instanceof ContaCorrente){
								//Cast
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da conta corrente é: R$ " + cc.getLimite());
		}
		
		if (conta instanceof ContaPoupanca) {
								//Cast
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println(" O rendimento da conta poupança é: R$ " + cp.getRendimento());
		}
		
	}

}
