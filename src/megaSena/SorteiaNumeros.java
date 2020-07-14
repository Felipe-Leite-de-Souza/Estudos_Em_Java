package megaSena;

public class SorteiaNumeros {
	public static final int numeroMaximo = 60;
	public static final int quantidadeDeNumeros = 6;
	
	private int [] numeroDaSorte;
	
	public void sorteio() {
		this.numeroDaSorte = new int[quantidadeDeNumeros];
		
		for (int i = 1; i <= quantidadeDeNumeros; i++) {
			int numerosDaSorte = (int) Math.round(Math.random() * numeroMaximo);
			
			if (!this.numeroJaSorteado(numerosDaSorte) && numerosDaSorte != 0) {
				this.numeroDaSorte[i-1] = numerosDaSorte;
			} else {
				i--;
			}
		}
	}
	
	public void exibirNumeros() {
		for (int numerosDaSorte : numeroDaSorte) {
			System.out.print(numerosDaSorte + " ");
		}
		System.out.println();
	}
	
	private boolean numeroJaSorteado(int numero) {
		boolean resultado = false;
		for (int i = 0; i < this.numeroDaSorte.length; i++) {
			if (this.numeroDaSorte[i] == numero) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}
	
}
