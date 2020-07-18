package decimalFormatado;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,###,##0.00");
		double valor = 1500.55;
		
		System.out.println("Sem formata��o: " + valor + "\n\n");
		System.out.println("Com formata��o: " + formatador.format(valor) + "\n\n");
		
		String entrada = "R$ 1200,00";
		try {
			double pegarEmNumero = formatador.parse(entrada).doubleValue();
			System.out.println("Convertendo texto para n�mero: " + pegarEmNumero + "\n\n");
		} catch (ParseException e) {
			System.out.println("Entrada inv�lida!\n\n");
		}
		
		//O BigDecimal suporta n�meros acima do double (tipo primitivo)
		BigDecimal bigDecimal = new BigDecimal(10000);
		
		System.out.println("Exemplo BigDecimal: " + bigDecimal);
		
		
	}

}
