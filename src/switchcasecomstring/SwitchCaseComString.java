package switchcasecomstring;

public class SwitchCaseComString {
	
	/*
	 * Utilizando o Switch Case com String do Java 7
	 */
	
	public static void main(String[] args) {

		String carro = args.length > 0 ? args[0] : "Audi";

		/*if (carro.equals("Audi")) {
			System.out.println("Alem�o");
		} else if (carro.equals("Ferrari")) {
			System.out.println("Italiano");
		}*/

		switch (carro) {
		case "Audi": 
			System.out.println("Alem�o");
			break;
		case "Ferrari":
			System.out.println("Italiano");
			break;
		case "Honda": 
			System.out.println("Japon�s");
			break;
		default:
			System.out.println("N�o informou nenhum carro!");

		}
	}

}
