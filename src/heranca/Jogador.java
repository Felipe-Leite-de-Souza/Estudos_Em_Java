package heranca;

public class Jogador extends Pessoa {
	
	protected boolean aindaJoga = false;
	
	public void descobrirSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
	
}
