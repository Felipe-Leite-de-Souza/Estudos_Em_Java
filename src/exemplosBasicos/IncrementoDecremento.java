package exemplosBasicos;

public class IncrementoDecremento {

	public static void main(String[] args) {
		int idade = 10;
		int quantidade = 20;
		
		System.out.println("Exemplo de incremento");
		System.out.println("------------------------\n");
		System.out.println("\"Adiciona +1 na novaIdade + a idade\"\n");
		int novaIdade = ++idade;

		System.out.println("Idade: " + idade);
		System.out.println("Nova idade: " + novaIdade + "\n");
		
		System.out.println("Adiciona o valor da vari�vel idade na vari�vel novaIdade1 antes de soma-l�,"); 
		System.out.println("por isso a vari�vel novaIdade1 � mostrada com o valor antes da soma.\n");
		int novaIdade1 = idade++;

		System.out.println("Idade: " + idade);
		System.out.println("Nova idade 1: " + novaIdade1);
		
		System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\n\nExemplo de decremento");
		System.out.println("------------------------\n");
		
		System.out.println("\"Retira 1 da vari�vel quantiade + a idade\"\n");
		int novaQuantidade = --quantidade;
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Nova quantidade: " + novaQuantidade + "\n");
		
		
		System.out.println("Adiciona o valor da vari�vel quantidade na vari�vel novaQauntidade1 antes de subtrai-l�,"); 
		System.out.println("por isso a vari�vel novaQuantidade1 � mostrada com o valor antes da subtra��o\n");
		int novaQuantidade1 = quantidade--;
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Nova quantidade1: " + novaQuantidade1);

	}

}
