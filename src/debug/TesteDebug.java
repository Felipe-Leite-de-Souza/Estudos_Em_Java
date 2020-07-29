package debug;

public class TesteDebug {

	public static void main(String[] args) {
		long posicao = 7;
		long valor = Fibonacci.calcula(posicao);
		
		System.out.println("F(" + posicao + ") = " + valor);
	}

}
