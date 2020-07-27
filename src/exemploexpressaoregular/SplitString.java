package exemploexpressaoregular;

public class SplitString {

	public static void main(String[] args) {
		String texto = "Java é uma linguagem orientada a objetos.";

		String[] palavrasDoTexto = texto.split(" ");
		for (String palavras :   palavrasDoTexto) {
			System.out.println(palavras);
		}

		System.out.println("\n\n");

		String texto1 = "Java12é33uma91linguagem93orientada41a58objetos.";

		/* Ao utilizar "\\d+" não importa a quantidade de dígitos
		 * ele sera separado em 1 em 1 palavra igual o exemplo acima
		 */
		String[] palavrasDoTexto1 = texto1.split("\\d+");
		for (String palavras1 :   palavrasDoTexto1) {
			System.out.println(palavras1);
		}

	}

}
