package excecoes;

public class ContaCorrente {
	
	private double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("O valor n�o pode ser menor do que zero.");
		}
		this.saldo += deposito;
	}
	
	public void sacar(double quantidade) throws SaldoInsuficienteException {
		double saldoTemp = saldo - quantidade;
		if (saldoTemp < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente!");
		}
		this.saldo -= quantidade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
