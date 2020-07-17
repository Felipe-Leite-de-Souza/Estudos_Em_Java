package datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDeDatas {

	public static void main(String[] args) {
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		DateFormat formatadorDeDatas = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatadorDeDatas.format(hoje));
		
		String dataAniversario = "20/01/1985";
		DateFormat formatadorDeDatas2 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date aniversario = formatadorDeDatas2.parse(dataAniversario);
			System.out.println(formatadorDeDatas.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de data inválido!");
		}
	}

}
