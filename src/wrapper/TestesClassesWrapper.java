package wrapper;

public class TestesClassesWrapper {
	public static void main(String[] args) {

		//Primitivo
		//byte, short,    int, long, float,  double e char
		
		//Wrapper(Envelope)
		//Byte, Short, Integer, Long, Float, Double e Character
		
		int x = 5;
		Integer i = new Integer(5);
		
		System.out.println(x);
		
		byte y = i.byteValue();
		
		System.out.println(y);
		
		
		String valor ="15.5";
		Float v = new Float(valor);
		System.out.println(v+3);
		
		int idade = Integer.parseInt("27");
		System.out.println("Daqui a 5 anos você terá: " + (idade + 5) + " anos.");
		
		try {
			double custo = Double.parseDouble("Vinte e três reais e cinquenta centavos.");
			System.out.println("Custo total: " + custo);
		} catch(NumberFormatException e) {
			System.err.println("Número inválido para a conversão.");
		}
		
	}
}
