package exemplosBasicos;

/*
 * Construir um programa que receba 3 pre�os (5,8,12) e que imprima para o usu�rio os valores de cada um deles e sua m�dia.
 */


public class ExemploCalculoDeMedia {

	public static void main(String[] args) {
		int preco1 = 5;
		int preco2 = 8;
		int preco3 = 12;
		
		int precoTotal = preco1 + preco2 + preco3;
		
		int precoMedio = precoTotal / 3;
		
		System.out.println("\"Sistema de C�lculo de M�dia\"");
		System.out.println("Pre�o 1: " + preco1);
		System.out.println("Pre�o 2: " + preco2);
		System.out.println("Pre�o 3: " + preco3);
		System.out.println("Pre�o m�dio: " + precoMedio);

	}

}
