package collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fernanda");
		Aluno aluno2 = new Aluno("Isis");
		Aluno aluno3 = new Aluno("Thiago");
		Aluno aluno4 = new Aluno("Alberto");
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		
		imprimirAlunos(alunos);
		
	}
	
	//Declarado com STATIC pois será chamado dentro do método main
	public static void imprimirAlunos(List<Aluno> alunos) {
		//For Iterator
		for (Aluno aluno : alunos) {
			System.out.println("Nome do aluno: " + aluno.getNome());
		}
	}

}
