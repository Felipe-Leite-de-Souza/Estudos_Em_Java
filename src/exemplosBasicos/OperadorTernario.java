package exemplosBasicos;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		String indicacao = (idade >= 18) ? "adulto" : "criança/adolescente"; 
		
		// Não reomendado por causar confunsão ao ler
		//String indicacao = (idade >= 18) ? "adulto" : (idade <= 12 ? "criança" : "adolescente");
		
		
		/* 
		//Forma "comum" de se fazer sem o operador ternário
		if (idade >= 18) {
			indicacao = "adulto";
		} else {
			indicacao = "criança/adolescente";
		}
		*/
		System.out.println("Resultado: " + indicacao);
		
		entrada.close();
	}

}
