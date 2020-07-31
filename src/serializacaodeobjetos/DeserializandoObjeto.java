package serializacaodeobjetos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializandoObjeto {

	public static void main(String[] args) {
		
		try (ObjectInput input = new ObjectInputStream(new FileInputStream("fernanda.obj"))){
			Pessoa pessoa = (Pessoa) input.readObject();
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Profissão: " + pessoa.getProfissao());
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.err.println("Erro ao converter para classe Pessoa.");
			e.printStackTrace();
			
		}
	}

}
