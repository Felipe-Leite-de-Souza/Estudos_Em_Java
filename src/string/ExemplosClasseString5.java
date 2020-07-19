package string;

public class ExemplosClasseString5 {

	public static void main(String[] args) {
		//Usados para gerar uma nova String começando da posição em que ordenamos
		//public String subsString(int beginIndex)
		
		//Esse construtor neste caso também pode se definir um fim
		//public String subsString(int beginIndex, int endIndex)
		
		
		//1° Forma
		String s = "Linguagem de Programação Java";
		//Ele não altera a String e sim gera uma nova String
		System.out.println(s.substring(13));
		
		//2° Forma
		String s2 = "Linguagem de Programação Java";
		System.out.println(s2.substring(13, 29));
		
	}

}
