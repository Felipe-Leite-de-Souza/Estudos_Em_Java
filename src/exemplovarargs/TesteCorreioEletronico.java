package exemplovarargs;

public class TesteCorreioEletronico {

	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();
		
		//Modo Antigo - também funciona
		//correio.enviarEmails(new String[] {"andressa01@hotmail.com", "thiago@hotmail.com", "javeiro@hotmail.com"});
		
		correio.enviarEmails("andressa01@hotmail.com", "thiago@hotmail.com", "javeiro@hotmail.com");

	}

}
