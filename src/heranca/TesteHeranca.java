package heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		jogador.nome = "Alex";
		jogador.idade = 23;
		
		jogador.apresentacao();
		jogador.descobrirSeAindaJoga();
		
	}

}
