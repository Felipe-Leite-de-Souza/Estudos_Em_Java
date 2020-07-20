package string;

public class ExemploStringBuilder {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		/*
		 * Concatena tudo em uma �nica String 
		 * sem ser necess�rio criar uma nova 
		 * assim como o StringBuffer.
		 * 
		 * Apesar de funcionar igualmente o
		 * StringBufffer a diferen�a � que o  
		 * StringBuilder n�o � thread-safe.
		 * 
		 * Consequentemente ele � mais r�pido do 
		 * que o StringBuffer.
		 */
		stringBuilder.append("Linguagem ");
		stringBuilder.append("de ");
		stringBuilder.append("Programa��o.");
		
		System.out.println(stringBuilder.toString());
		
		stringBuilder.insert(24, " Java");
		
		System.out.println(stringBuilder);
	}

}
