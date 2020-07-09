package exemplosBasicos;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		String indicacao = (idade >= 18) ? "adulto" : "crian�a/adolescente"; 
		
		// N�o reomendado por causar confuns�o ao ler
		//String indicacao = (idade >= 18) ? "adulto" : (idade <= 12 ? "crian�a" : "adolescente");
		
		
		/* 
		//Forma "comum" de se fazer sem o operador tern�rio
		if (idade >= 18) {
			indicacao = "adulto";
		} else {
			indicacao = "crian�a/adolescente";
		}
		*/
		System.out.println("Resultado: " + indicacao);
		
		entrada.close();
	}

}
