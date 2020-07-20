package string;

public class ExemploStringBuilder {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		/*
		 * Concatena tudo em uma única String 
		 * sem ser necessário criar uma nova 
		 * assim como o StringBuffer.
		 * 
		 * Apesar de funcionar igualmente o
		 * StringBufffer a diferença é que o  
		 * StringBuilder não é thread-safe.
		 * 
		 * Consequentemente ele é mais rápido do 
		 * que o StringBuffer.
		 */
		stringBuilder.append("Linguagem ");
		stringBuilder.append("de ");
		stringBuilder.append("Programação.");
		
		System.out.println(stringBuilder.toString());
		
		stringBuilder.insert(24, " Java");
		
		System.out.println(stringBuilder);
	}

}
