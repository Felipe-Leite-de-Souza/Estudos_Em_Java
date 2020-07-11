package sobrecarga;

public class TesteDeCadastro {

	public static void main(String[] args) {
		CadastroDePessoa cadastroDePessoa = new CadastroDePessoa();
		
		Pessoa pessoa = new Pessoa("Alef", 28);
		cadastroDePessoa.cadastrar(pessoa);
		
		cadastroDePessoa.cadastrar("Alex", 46);

	}

}
