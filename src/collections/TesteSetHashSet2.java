package collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		Aluno alunoSelecionado = new Aluno("Daniela");
		
		//Contains - Comparador (possui um if interno)
		if (alunos.contains(alunoSelecionado)) {
			System.out.println("Parab�ns " + alunoSelecionado.getNome() + "! Voc� ganhou um ingresso para um show!");
		} else {
			System.out.println("Aluno n�o cadastrado no banco de dados.");
		}
		
	}

}
