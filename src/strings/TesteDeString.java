package strings;


/*
 * StringBuilder =  Reaproveita o espa�o criado (melhor n�o usar com concorr�ncia)
 * � mais r�pido do que o StringBuffer.
 * 
 * StringBuffer = Reaproveita o espa�o criado (indicado para uso de concorr�ncia)
 * � mais lento do que o StringBuilder
 */

public class TesteDeString {

	public static void main(String[] args) {
		String msg = "Ol�";
		msg += " Mundo!";
		
		System.out.println(msg);
		
		StringBuilder mensagem = new StringBuilder("Ol�");
		mensagem.append(" Mundo!");
		
		System.out.println("Com StringBuilder: " + mensagem);

	}

}
