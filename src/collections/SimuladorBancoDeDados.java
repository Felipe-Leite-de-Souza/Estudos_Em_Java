package collections;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {
	
	public static Set<Aluno> buscarAlunos(){
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Pâmela"));
		alunos.add(new Aluno("Renato"));
		alunos.add(new Aluno("Daniela"));
		alunos.add(new Aluno("Vanessa"));
		
		return alunos;
	}

}
