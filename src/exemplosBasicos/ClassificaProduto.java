package exemplosBasicos;

import java.util.Scanner;

/* 
* O programa dever� solicitar o c�digo do produto para o usu�rio.
* Ao receber o c�digo o programa dever� distinguir entre �mpar e par e posicionar na direita se for par
* ou esquerda se for �mpar.
* Cada corredor possui 8 gavetas e dever� ser ordenado tendo sua divis�o pelo seu resto
*/

public class ClassificaProduto {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int codProduto = 0;
		
		do {
			System.out.println("Digite o c�digo do produto: ");
			codProduto = entrada.nextInt();
			
			if (codProduto !=0) {
				String corredor = (codProduto % 2 == 0) ? "\"direita\"" : "\"esquerda\"";
				
				for (int i = 8; i >= 1; i--) {
					if (codProduto % i ==0) {
						System.out.println("O produto de c�digo: " + codProduto + " ficar� no corredor da " + corredor + " e na gaveta " + i);
						break;
					}
				}
			}
			
		} while(codProduto != 0);
		
		entrada.close();

	}

}
