package collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fernanda");
		Aluno aluno2 = new Aluno("Isis");
		Aluno aluno3 = new Aluno("Thiago");
		Aluno aluno4 = new Aluno("Alberto");
		
		//Interface				//Classe
		//K = Chave  - V = Valor
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		
		//Para adicionar no HashMap é utilizado o métido "put"
		//OBS: Não pode haver chaves repetidas para não sobreescrever o objeto
		//Aceita Repetições
		alunos.put("1", aluno1);
		alunos.put("2", aluno2);
		alunos.put("3", aluno3);
		alunos.put("4", aluno4);
		alunos.put("5", aluno4);
		
		imprimirAlunos(alunos);
		
		Aluno alunoRA = alunos.get("2");
		System.out.println("\n\nRA do aluno de chave 2: " + alunoRA.getNome());
		
	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno aluno : alunos.values()) {
			System.out.println("Nome: " + aluno.getNome());
		}
	}

}
