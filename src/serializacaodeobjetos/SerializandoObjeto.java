package serializacaodeobjetos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializandoObjeto {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Amanda Ferreira");
		pessoa.setIdade(27);
		pessoa.setProfissao("Engenheira Química");
		
		try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("fernanda.obj"))) {
			output.writeObject(pessoa);
			System.out.println("Objeto salvo com sucesso!");
		} catch (IOException e) {
			System.err.println("Erro ao salvar objeto. " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
