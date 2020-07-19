package string;

public class ExemplosClasseString7 {

	public static void main(String[] args) {
		String s = "Desenvolvimento_em_Java";

		String[] array = s.split("_");

		for (int i = 0; i < array.length; i++) {	
			System.out.println("[" + i + "]" + array[i]);
		}

	}

}
