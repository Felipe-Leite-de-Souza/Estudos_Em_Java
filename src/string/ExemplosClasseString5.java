package string;

public class ExemplosClasseString5 {

	public static void main(String[] args) {
		//Usados para gerar uma nova String come�ando da posi��o em que ordenamos
		//public String subsString(int beginIndex)
		
		//Esse construtor neste caso tamb�m pode se definir um fim
		//public String subsString(int beginIndex, int endIndex)
		
		
		//1� Forma
		String s = "Linguagem de Programa��o Java";
		//Ele n�o altera a String e sim gera uma nova String
		System.out.println(s.substring(13));
		
		//2� Forma
		String s2 = "Linguagem de Programa��o Java";
		System.out.println(s2.substring(13, 29));
		
	}

}
