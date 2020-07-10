package poo;

public class Principal2 {

	public static void main(String[] args) {
		Proprietario dono = new Proprietario();
		dono.nome = "Thiago Perreira";
		dono.cpf = "123.456.789-00";
		dono.idade = 25;
		dono.logradouro = "Rua Desconhecida, 123";
		dono.bairro = "Centro";
		dono.cidade = "São Paulo";
		
		
		Carro carro = new Carro();
		carro.anoDeFabricacao = 2011;
		carro.cor = "Prata";
		carro.fabricante = "Fiat";
		carro.modelo = "Pailo";
		carro.dono = dono;
		
		System.out.println("Dados do proprietário: \n");
		System.out.println("Nome: " + dono.nome);
		System.out.println("CPF: " + dono.cpf);
		System.out.println("Idade: " + dono.idade);
		System.out.println("Logradouro: " + dono.logradouro);
		System.out.println("Bairro: " + dono.bairro);
		System.out.println("Cidade: " + dono.cidade);
		
		System.out.println("\n\n");
		
		System.out.println("Dados do veículo tipo carro: \n");
		System.out.println("Ano de fabricação: " + carro.anoDeFabricacao);
		System.out.println("Cor: " + carro.cor);
		System.out.println("Fabricante: " + carro.fabricante);
		System.out.println("Modelo: " + carro.modelo);
		

	}

}
