package exemplosBasicos;

/*
 * Construir um programa que receba 3 preços (5,8,12) e que imprima para o usuário os valores de cada um deles e sua média.
 */


public class ExemploCalculoDeMedia {

	public static void main(String[] args) {
		int preco1 = 5;
		int preco2 = 8;
		int preco3 = 12;
		
		int precoTotal = preco1 + preco2 + preco3;
		
		int precoMedio = precoTotal / 3;
		
		System.out.println("\"Sistema de Cálculo de Média\"");
		System.out.println("Preço 1: " + preco1);
		System.out.println("Preço 2: " + preco2);
		System.out.println("Preço 3: " + preco3);
		System.out.println("Preço médio: " + precoMedio);

	}

}
