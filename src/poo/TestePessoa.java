package poo;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("João");
		
		System.out.println("Nome: \"" + pessoa.nome + "\" tem " + pessoa.idade + " anos.");
		
		Pessoa pessoa2 = new Pessoa("Maria", 22);
		System.out.println("Nome: \"" + pessoa2.nome + "\" tem " + pessoa2.idade + " anos.");

	}

}
