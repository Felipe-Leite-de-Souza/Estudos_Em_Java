package strings;


/*
 * StringBuilder =  Reaproveita o espaço criado (melhor não usar com concorrência)
 * É mais rápido do que o StringBuffer.
 * 
 * StringBuffer = Reaproveita o espaço criado (indicado para uso de concorrência)
 * É mais lento do que o StringBuilder
 */

public class TesteDeString {

	public static void main(String[] args) {
		String msg = "Olá";
		msg += " Mundo!";
		
		System.out.println(msg);
		
		StringBuilder mensagem = new StringBuilder("Olá");
		mensagem.append(" Mundo!");
		
		System.out.println("Com StringBuilder: " + mensagem);

	}

}
