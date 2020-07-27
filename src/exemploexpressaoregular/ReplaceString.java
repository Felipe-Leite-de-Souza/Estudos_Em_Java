package exemploexpressaoregular;

public class ReplaceString {

	public static void main(String[] args) {
		String texto = "O valor do produto é de R$ @x@.";
		
		/* Utilizamos o "+" após o primoeiro x pois ele pode seguir
		 * de uma sequência de x's. 
		 */
		String textoModificado = texto.replaceAll("@x+@", "50,00");
		System.out.println(textoModificado);
	}

}
