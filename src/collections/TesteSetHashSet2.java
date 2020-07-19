package collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		Aluno alunoSelecionado = new Aluno("Daniela");
		
		//Contains - Comparador (possui um if interno)
		if (alunos.contains(alunoSelecionado)) {
			System.out.println("Parabéns " + alunoSelecionado.getNome() + "! Você ganhou um ingresso para um show!");
		} else {
			System.out.println("Aluno não cadastrado no banco de dados.");
		}
		
	}

}
