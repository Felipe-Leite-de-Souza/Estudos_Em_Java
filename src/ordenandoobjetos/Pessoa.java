package ordenandoobjetos;

/*
 * Comparable implementa-se direto a comparação entre os objetos desse tipo de classe.
 * Caso não passe nenhum Comparator ele usa como ordem natural.
 */

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return this.nome + " tem " + this.idade + " anos.";
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return this.nome.compareTo(pessoa.getNome());
	}
}
