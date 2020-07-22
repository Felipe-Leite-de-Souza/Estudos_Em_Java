package exemplovarargs;

//Somente um exemplo...

public class CorreioEletronico {
	
	
	/*Para fazermos ele em varargs retiramos os colchetes "[]" 
	 * do par�metro passado no m�todo e subistituimos ele por 
	 * tr�s pontos/pontinhos "..."
	 */
	public void enviarEmails(String... emails) {
		
		//Percorrer todos os emails
		for (String email : emails) {
			//corpo da l�gica
			System.out.println("E-mail enviado para " + email);
		}
	}
	
}
