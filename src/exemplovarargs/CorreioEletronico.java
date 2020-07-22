package exemplovarargs;

//Somente um exemplo...

public class CorreioEletronico {
	
	
	/*Para fazermos ele em varargs retiramos os colchetes "[]" 
	 * do parâmetro passado no método e subistituimos ele por 
	 * três pontos/pontinhos "..."
	 */
	public void enviarEmails(String... emails) {
		
		//Percorrer todos os emails
		for (String email : emails) {
			//corpo da lógica
			System.out.println("E-mail enviado para " + email);
		}
	}
	
}
