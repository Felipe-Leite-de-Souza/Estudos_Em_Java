package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class TesteDoCalendar {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		
		calendar.set(Calendar.DAY_OF_MONTH, 31);
		calendar.set(Calendar.MONTH, 0); //Lembrete que em Java os meses começão a contar a partir do zero.
		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.HOUR_OF_DAY, 10);
		calendar.set(Calendar.MINUTE, 30);
		calendar.set(Calendar.SECOND, 0);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yy HH:mm:ss\n");
		System.out.println(formatador.format(calendar.getTime()));
		
		//Adicionando 1 dia no mês - O mesmo modelo serve para mês
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println("Adicionando 1 dia no mês");
		System.out.println(formatador.format(calendar.getTime()));
		
		//Subtraindo 1 dia no mês - O mesmo modelo serve para mês
		calendar.add(Calendar.DAY_OF_MONTH, -2);
		System.out.println("Subtraindo 1 dia no mês");
		System.out.println(formatador.format(calendar.getTime()));
		
		//Mexendo no dia sem alterar o mês e ano
		calendar.roll(Calendar.DAY_OF_MONTH, 2);
		System.out.println("Mexendo no dia sem alterar o mês e ano");
		System.out.println(formatador.format(calendar.getTime()));
		
	}

}
