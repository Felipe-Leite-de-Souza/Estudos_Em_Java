package exemplosBasicos;

import java.util.Scanner;

/* 
* O programa deverá solicitar o código do produto para o usuário.
* Ao receber o código o programa deverá distinguir entre ímpar e par e posicionar na direita se for par
* ou esquerda se for ímpar.
* Cada corredor possui 8 gavetas e deverá ser ordenado tendo sua divisão pelo seu resto
*/

public class ClassificaProduto {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int codProduto = 0;
		
		do {
			System.out.println("Digite o código do produto: ");
			codProduto = entrada.nextInt();
			
			if (codProduto !=0) {
				String corredor = (codProduto % 2 == 0) ? "\"direita\"" : "\"esquerda\"";
				
				for (int i = 8; i >= 1; i--) {
					if (codProduto % i ==0) {
						System.out.println("O produto de código: " + codProduto + " ficará no corredor da " + corredor + " e na gaveta " + i);
						break;
					}
				}
			}
			
		} while(codProduto != 0);
		
		entrada.close();

	}

}
