package poo;

public class Pessoa {
	String nome;
	int idade;
	
	Pessoa(String nome) {
		this.nome = nome;
	}
	
	Pessoa(String nome, int idade) {
		this(nome); // chamando o construtor de cima neste exemplo
		this.idade = idade;
	}
}
