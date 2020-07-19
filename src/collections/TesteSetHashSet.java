package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fernanda");
		Aluno aluno2 = new Aluno("Isis");
		Aluno aluno3 = new Aluno("Thiago");
		Aluno aluno4 = new Aluno("Alberto");
		
		//HashSet n�o aceita "duplica��o"
		//Executa a busca em ordem aleat�ria
		//N�o possu� indice pois seu acesso � aleat�rio
		Set<Aluno> alunos = new HashSet<Aluno>();
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		alunos.add(aluno4); //Conjunto n�o aceita repeti��es
		
		imprimirAlunos(alunos);
		
	}
	
	public static void imprimirAlunos(Set<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
		}
	}

}
