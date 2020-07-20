package string;

public class ExemploStringBuffer {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();		
		
		/*
		 * Concatena tudo em uma �nica String 
		 * sem ser necess�rio criar uma nova 
		 * assim como o StringBuilder.
		 * 
		 * Apesar de funcionar igualmente o
		 * StringBuilder a diferen�a � que o 
		 * StringBuffer � thread-safe.
		 * 
		 * Usado no contexto de concorr�ncia.
		 * 
		 * Consequentemente ele � mais lento do 
		 * que o StringBuilder.
		 */
		stringBuffer.append("Linguagem ");
		stringBuffer.append("de ");
		stringBuffer.append("Programa��o.");
		
		System.out.println(stringBuffer.toString());
		
		stringBuffer.insert(24, " Java");
		
		System.out.println(stringBuffer);
	}

}
