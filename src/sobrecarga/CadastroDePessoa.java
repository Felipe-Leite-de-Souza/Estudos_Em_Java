package sobrecarga;

public class CadastroDePessoa {
	
	/*Podemos escrever de v�rias formas os mesmos m�todos
	 * trocando apenas o tipo de par�metro que ele espera,
	 * aumentando ou diminuindo eles.
	 */
	
	public void cadastrar(Pessoa pessoa) {
		armazenar(pessoa.getNome(), pessoa.getIdade());
	}
	
	public void cadastrar(String nome, int idade) {
		armazenar(nome, idade);
	}	
	
	public void cadastrar(String nome) {
		armazenar(nome,0);
	}
	
	private void armazenar(String nome, int idade) {
		System.out.println("Salvando: \"" + nome + "\" com " + idade + " anos.");
	}
	
}
