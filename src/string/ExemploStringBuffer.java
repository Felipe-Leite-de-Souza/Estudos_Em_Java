package string;

public class ExemploStringBuffer {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();		
		
		/*
		 * Concatena tudo em uma única String 
		 * sem ser necessário criar uma nova 
		 * assim como o StringBuilder.
		 * 
		 * Apesar de funcionar igualmente o
		 * StringBuilder a diferença é que o 
		 * StringBuffer é thread-safe.
		 * 
		 * Usado no contexto de concorrência.
		 * 
		 * Consequentemente ele é mais lento do 
		 * que o StringBuilder.
		 */
		stringBuffer.append("Linguagem ");
		stringBuffer.append("de ");
		stringBuffer.append("Programação.");
		
		System.out.println(stringBuffer.toString());
		
		stringBuffer.insert(24, " Java");
		
		System.out.println(stringBuffer);
	}

}
