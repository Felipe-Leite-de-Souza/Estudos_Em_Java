package exercitandoOsNumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Numeros {

	public void Formatar() {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #,###,##0.00");
		
		System.out.println("Valor do produto:");
		double valor = entrada.nextDouble();
		
		BigDecimal valorDecimal = new BigDecimal(valor);
		BigDecimal dezPorcento = valorDecimal.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		
		String valorFormatado = formatador.format(dezPorcento.doubleValue());
		System.out.println("10% do valor �: " + valorFormatado);
		
		entrada.close();
	}
	
}
