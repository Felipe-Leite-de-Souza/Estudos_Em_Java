package exemploexpressaoregular;

public class ReplaceString {

	public static void main(String[] args) {
		String texto = "O valor do produto � de R$ @x@.";
		
		/* Utilizamos o "+" ap�s o primoeiro x pois ele pode seguir
		 * de uma sequ�ncia de x's. 
		 */
		String textoModificado = texto.replaceAll("@x+@", "50,00");
		System.out.println(textoModificado);
	}

}
