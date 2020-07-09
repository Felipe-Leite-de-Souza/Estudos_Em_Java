package petshop;

public class PetShop {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Bidu";
		cachorro.raca = "Boxer";
		cachorro.sexo = 'M';
		cachorro.idade = 1;
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.nome = "Marcos";
		cachorro1.raca = "Pinscher";
		cachorro1.sexo = 'M';
		cachorro1.idade = 2;
		
		System.out.println("Cachorro:");
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
		System.out.println("Idade: " + cachorro.idade);
		
		System.out.println("\n--------------------\n");
		
		System.out.println("Cachorro:");
		System.out.println("Nome: " + cachorro1.nome);
		System.out.println("Raça: " + cachorro1.raca);
		System.out.println("Sexo: " + cachorro1.sexo);
		System.out.println("Idade: " + cachorro1.idade);

	}

}
