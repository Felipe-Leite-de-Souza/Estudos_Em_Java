package classeMath;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {

	public static void main(String[] args) {
		//Cálculo de comprimento com o Math do Java Lang
		int raio = 4;
		double comprimento = ((2 * raio) * PI);
		System.out.println("Comprimento: " + comprimento + "\n");
		
		//Maior ou menor
		double[] precoProdutoA = { 50.00, 42.70 };
		double maiorPreco = max(precoProdutoA[0], precoProdutoA[1]);
		System.out.println("Maior preço: " + maiorPreco + "\n");
		System.out.println("Menor preço: " + Math.min(precoProdutoA[0], precoProdutoA[1]) + "\n");
		
		//Potência
		System.out.println("2³: " + Math.pow(2, 3) + "\n");
		
		//Raiz Quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9) + "\n");
		
		//Arredondamento ceil, floor e round
		double n = 6.74;
		System.out.println("Maior inteiro: " + Math.ceil(n));
		System.out.println("Menor inteiro: " + Math.floor(n));
		System.out.println("Arredondando: " + Math.round(n) + "\n");
		
		//Trigonometria
		System.out.println("Seno de 45°: " + Math.sin(45));
		System.out.println("Cosseno de 45°: " + Math.cos(45));
		System.out.println("Tangente de 90°: " + Math.tan(45) + "\n");
		
		//Números randomicos
		double numeroAleatorio = Math.random() * 100;
		System.out.println("Número aleatório: " + numeroAleatorio);
	}

}
