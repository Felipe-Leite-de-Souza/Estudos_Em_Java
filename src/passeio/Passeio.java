package passeio;

public class Passeio {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Maria";
		
		pessoa.cachorro = new Cachorro();
		
		pessoa.cachorro.nome = "Max";
		pessoa.cachorro.idade = 3;
		pessoa.cachorro.raca = "Boxer";
		pessoa.cachorro.sexo = 'M';
		
		Caminhada caminhada = new Caminhada();
		caminhada.andar(pessoa);

	}

}
