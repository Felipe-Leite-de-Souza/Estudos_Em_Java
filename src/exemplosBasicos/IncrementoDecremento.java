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
		
		System.out.println("Adiciona o valor da variável idade na variável novaIdade1 antes de soma-lá,"); 
		System.out.println("por isso a variável novaIdade1 é mostrada com o valor antes da soma.\n");
		int novaIdade1 = idade++;

		System.out.println("Idade: " + idade);
		System.out.println("Nova idade 1: " + novaIdade1);
		
		System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\n\nExemplo de decremento");
		System.out.println("------------------------\n");
		
		System.out.println("\"Retira 1 da variável quantiade + a idade\"\n");
		int novaQuantidade = --quantidade;
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Nova quantidade: " + novaQuantidade + "\n");
		
		
		System.out.println("Adiciona o valor da variável quantidade na variável novaQauntidade1 antes de subtrai-lá,"); 
		System.out.println("por isso a variável novaQuantidade1 é mostrada com o valor antes da subtração\n");
		int novaQuantidade1 = quantidade--;
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Nova quantidade1: " + novaQuantidade1);

	}

}
